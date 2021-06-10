package View;

import Model.Interval;
import Model.TANetwork;
import Model.Automaton;
import Model.TAVisitor;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import Model.Parser.*;

public class App extends JFrame{
    private JButton delayTransition;
    private JPanel panelMain;
    private JSpinner spinner1;
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


    private TANetwork automata;

    public App(String title) {
        super(title);
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        delayTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        updateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String code = getTextDeclarationArea();
                    CharStream input = CharStreams.fromString(code);

                    TALexer lexer = new TALexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    TAParser parser = new TAParser(tokens);
                    TAParser.ModelContext tree = parser.model();

                    TAVisitor eval = new TAVisitor();
                    eval.visit(tree);

                    App.this.automata = eval.getAutomata();
                }catch (Exception error){
                    error.printStackTrace();
                }

            }
        });


        invariantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LinkedHashMap<String, Automaton> mapAutomata = App.this.automata.getAutomaton();
                Set<Map.Entry<String, Automaton>> entrySet = mapAutomata.entrySet();
                Iterator<Map.Entry<String, Automaton>> it = entrySet.iterator();
                Automaton initautomata = it.next().getValue();
                Interval a = initautomata.configInvariant();

                App.this.invariantLabel.setText("[ " + a.getMin() + ", " + a.getMax() + " ]");

            }
        });
    }
    public String getTextDeclarationArea(){
        return this.declarationArea.getText();
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
