package View;

import Controller.Controller;
import Controller.TAVisitor;
import Model.*;
import Model.Errors.CannotTakeTransition;
import Model.Errors.TaErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import Model.Parser.*;

public class App extends JFrame{
    private JButton delayTransition;
    private JPanel panelMain;
    private JSpinner spinnerDelay;
    private JLabel delayLabel;
    private JButton updateButton;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topPanel;
    private JPanel downPanel;
    private JTextArea declarationArea;
    private JTextArea printArea;
    private JButton invariantButton;
    private JLabel invariantLabel;
    private JPanel invariantPanel;
    private JPanel delayTransitionsPanel;
    private JList<String> listTransitions;
    private JButton discreteTransitionButton;
    private JTextField delayField;
    private JList<String> listTraces;
    private JScrollPane scrollListTransitions;
    private JScrollPane scrollListTraces;
    private JPanel tracesPanel;
    private JButton a;
    private JSlider slideSpeedSimulation;
    private JButton randomSimulationButton;
    private JLabel minInvLabel;
    private JLabel maxInvLabel;
    private JLabel commaInvLabel;
    private JPanel discretePanel;
    private JScrollPane discreteScroll;



    private JMenuBar menuBar;
    private JMenu file;
    private JMenuItem variables;
    private DefaultListModel<String> stringTransitions;
    private DefaultListModel<String> stringTraces;


    private Controller controller;
    private boolean randomSimulation;

    public App(String title) {

        super(title);

        this.setContentPane(this.panelMain);

        this.menuBar = new JMenuBar();
        this.file = new JMenu("File");
        this.variables = new JMenuItem("Variables");

        this.menuBar.add(this.file);
        this.file.add(this.variables);

        this.setJMenuBar(this.menuBar);


        App.this.stringTransitions = new DefaultListModel<>();
        App.this.stringTraces = new DefaultListModel<>();

        App.this.listTransitions.setModel(App.this.stringTransitions);
        App.this.listTraces.setModel(App.this.stringTraces);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();



        delayTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeDelayTransition();
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    App.this.printArea.setText("");
                    App.this.randomSimulation = false;
                    String code = getTextDeclarationArea();
                    CharStream input = CharStreams.fromString(code);

                    TALexer lexer = new TALexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    TAParser parser = new TAParser(tokens);
                    parser.removeErrorListeners();
                    parser.addErrorListener(new TaErrorListener(App.this.printArea));

                    TAParser.ModelContext tree = parser.model();

                    TAVisitor eval = new TAVisitor();
                    App.this.controller = null;
                    eval.visit(tree);

                    App.this.controller = eval.getController();

                    /*
                    LinkedHashMap<String, Automaton> mapAutomata = App.this.automata.getAutomaton();
                    Set<Map.Entry<String, Automaton>> entrySet = mapAutomata.entrySet();
                    Iterator<Map.Entry<String, Automaton>> it = entrySet.iterator();
                    App.this.automaton = it.next().getValue();
                     */



                    setLabelsIntervals();

                }catch (Exception error){
                    error.printStackTrace();
                }

            }
        });

        discreteTransitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeDiscreteTransition();
            }
        });

        variables.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, getVariablesString());
            }
        });
        randomSimulationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                takeRandomTransitions();

            }
        });
    }


    public String getTextDeclarationArea(){
        return this.declarationArea.getText();
    }

    public void takeDelayTransition(){
        String delayText = this.delayField.getText();
        try{
            double d = Double.parseDouble(delayText);
            this.controller.takeDelayTransition(d);

            this.setLabelsIntervals();
        }catch (NumberFormatException ignored){
            JOptionPane.showMessageDialog(null, "Delay is not a number");
        }
    }

    public void takeDiscreteTransition(){
        try{
            int i = this.listTransitions.getSelectedIndex();
            if(i<0){
                this.printArea.append("Transition is not selected");
                return;
            }
            this.controller.takeDiscreteTransition(i);
            this.setLabelsIntervals();
        }catch (CannotTakeTransition e){
            this.printArea.append(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    /*
    automaton a{
    locations = {a,b,c}
    clocks = {x,y,z}
    init = a

    }
     */

    public void takeRandomTransitions() {
        this.randomSimulation = !this.randomSimulation;

        new Thread (()->{
            while(this.randomSimulation){

                int speed = this.slideSpeedSimulation.getValue();
                int timeSleep = 1000-speed*9;
                System.out.println(timeSleep);

                try{

                    String maxInvString = this.maxInvLabel.getText();
                    double delay = Double.POSITIVE_INFINITY;

                    if(!maxInvString.equals("Infinity")){
                        delay = Double.parseDouble(maxInvString);
                    }

                    Random rand = new Random();

                    if(delay == Double.POSITIVE_INFINITY){
                        delay = rand.nextInt(Integer.MAX_VALUE);
                    }
                    else{
                        delay = rand.nextDouble()*delay;
                    }

                    this.controller.takeDelayTransition(delay);
                    this.setLabelsIntervals();


                    int nTransition = this.stringTransitions.size();

                    if(nTransition==0){
                        Thread.sleep(timeSleep);
                        continue;
                    }

                    nTransition = rand.nextInt(nTransition);
                    this.controller.takeDiscreteTransition(nTransition);
                    this.setLabelsIntervals();

                    Thread.sleep(timeSleep);
                }catch (InterruptedException error){
                    error.printStackTrace();
                }catch (NumberFormatException ignored){
                    JOptionPane.showMessageDialog(null, "Delay is not a number");
                }
            }
        }).start();
    }

    public void setLabelsIntervals(){
        this.stringTransitions.clear();
        this.stringTraces.clear();
        Interval invariantInterval = this.controller.intersectionInvariants();
        ArrayList<Location> currentLocation = this.controller.getCurrentLocation();

        for(Location loc: currentLocation){
            for(Edge edge: loc.getTargets()){
                String element = loc.getName().concat(", ");
                element = element.concat(edge.toString());
                this.stringTransitions.addElement(element);
            }
        }
        for(ArrayList<String> locations: this.controller.getTraceLocation()){
            String element = "( ";
            String separator = "";
            for(String locName: locations){
                element = element.concat(separator).concat(locName);
                separator = ", ";
            }
            element = element.concat(" )");
            this.stringTraces.addElement(element);
        }

        this.minInvLabel.setText(Double.toString(invariantInterval.getMin()));
        this.commaInvLabel.setText(", ");
        this.maxInvLabel.setText(Double.toString(invariantInterval.getMax()));
    }

    public String getVariablesString(){
        if(this.controller==null){
            return "";
        }
        return this.controller.getVariablesString();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new App("Timed Automata");

                frame.setSize(750,500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

    }
}
