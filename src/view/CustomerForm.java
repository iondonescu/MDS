package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class CustomerForm extends JFrame {

    private JPanel contentPane;

    private JLabel lbName;
    private JTextField tfName;

    private JLabel lbPhone;
    private JTextField tfPhone;

    private JButton btnSave;

    /*
    * Create the frame
     */
    public CustomerForm(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,492,287);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JPanel formPanel = new JPanel();
        contentPane.add(formPanel,BorderLayout.CENTER);
        formPanel.setLayout(new GridLayout(4,1));

        formPanel.add(this.getLbName());
        formPanel.add(this.getTfName());

        formPanel.add(this.getLbPhone());
        formPanel.add(this.getTfPhone());

        JPanel commandPanel = new JPanel();
        contentPane.add(commandPanel, BorderLayout.SOUTH);

        commandPanel.add(this.getBtnSave());
    }

    public JLabel getLbName(){
        if(lbName == null){
            lbName = new JLabel("Name: ");
        }
        return  lbName;
    }

    public JTextField getTfName() {
        if(tfName == null) {
            tfName = new JTextField(20);
        }
        return tfName;
    }

    public JLabel getLbPhone(){
        if(lbPhone == null){
            lbPhone = new JLabel("Phone:");
        }
        return lbPhone;
    }

    public JTextField getTfPhone(){
        if (tfPhone == null) {
            tfPhone = new JTextField(20);
        }
        return tfPhone;
    }

    public JButton getBtnSave(){
        if(btnSave == null){
            btnSave = new JButton("SAVE");
        }
        return btnSave;
    }
}
