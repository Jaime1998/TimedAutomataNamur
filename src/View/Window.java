package View;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {



    private JButton buttonUpdate;
    private JButton buttonSave;
    private JTextArea areaDeclaration;

    public Window() {
        this.setSize(1000,700);
        this.setMinimumSize(new Dimension(500,500));
        this.setLocationRelativeTo(null);
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    private void initComponents(){
        this.getContentPane().setLayout(new GridBagLayout());
        areaDeclaration  = new JTextArea("//Declaration");
        JScrollPane scrollDeclaration = new JScrollPane(areaDeclaration);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        this.getContentPane().add (scrollDeclaration, constraints);
        constraints.weighty = 0.0;

        buttonUpdate = new JButton ("Update Model");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        constraints.weightx = 0.4;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.fill = GridBagConstraints.NONE;
        this.getContentPane().add (buttonUpdate, constraints);
        constraints.weighty = 0.0;
        constraints.weightx = 0.0;

        buttonSave = new JButton ("Save");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (buttonSave, constraints);

        JTextField pathDirectory = new JTextField ("Directory");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add (pathDirectory, constraints);
        constraints.weightx = 0.0;
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }


}






