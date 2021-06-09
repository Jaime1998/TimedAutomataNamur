package View;

import Model.TAVisitor;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                }catch (Exception error){
                    error.printStackTrace();
                }

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
