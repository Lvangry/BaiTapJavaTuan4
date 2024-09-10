/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
///**
// *
// * @author ASUS
// */
//public class TinhToanDonGian {
//
//    private JLabel lb1,lb2,lb3;
//    private JTextField txtSo1,txtSo2,txtKq;
//    private JButton btCong,btTru,btNhan,btChia; 
//    
//    public TinhToanDonGian(){
//    setTitle("Tinh toan don gian");
//    taoGiaoDien();
//    setSize(400,300);
//    pack();
//    setLocationRelativeTo(null);
//    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        TinhToanDonGian frm=new TinhToanDonGian();
//        frm.setVisible(true);
//    }
//    private void taoGiaoDien(){
//    JPanel p1=new JPanel();
//    p1.setLayout(new GridLayout(3,2,5,5));
//    p1.add(lb1=new JPanel("So 1"));
//    p1.add(txtSo1=new JTextField());
//    p1.add(lb2=new JLabel("So 2"));
//    p1.add(txtSo2=new JTextField() );
//    p1.add(lb3=new JLabel("Ket qua"));
//    p1.add(txtKq=new JTextField());
//    
//    JPanel p2=new JPanel();
//    p2.add(btCong=new JButton("Cong"));
//    p2.add(btTru=new JButton("Tru"));
//    p2.add(btNhan=new JButton("Nhan"));
//    p2.add(btChia=new JButton("CHia"));
//    
//    setLayout(new BorderLayout());
//    add(p1,BorderLayout.CENTER);
//    add(p2,BorderLayout.SOUTH);
//    
//    
//    
//    }
//    
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TinhToanDonGIan extends JFrame {

    private final JTextField firstNumberField;
    private JTextField secondNumberField, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public TinhToanDonGIan() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create panels
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Create labels and text fields
        inputPanel.add(new JLabel("First Number:"));
        firstNumberField = new JTextField();
        inputPanel.add(firstNumberField);

        inputPanel.add(new JLabel("Second Number:"));
        secondNumberField = new JTextField();
        inputPanel.add(secondNumberField);

        inputPanel.add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        inputPanel.add(resultField);

        // Create buttons
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        // Add buttons to panel
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Add panels to frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        addButton.addActionListener(new CalculatorAction());
        subtractButton.addActionListener(new CalculatorAction());
        multiplyButton.addActionListener(new CalculatorAction());
        divideButton.addActionListener(new CalculatorAction());
    }

    private class CalculatorAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(firstNumberField.getText());
                double num2 = Double.parseDouble(secondNumberField.getText());
                double result = 0;

                if (e.getSource() == addButton) {
                    result = num1 + num2;
                } else if (e.getSource() == subtractButton) {
                    result = num1 - num2;
                } else if (e.getSource() == multiplyButton) {
                    result = num1 * num2;
                } else if (e.getSource() == divideButton) {
                    result = num1 / num2;
                }

                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TinhToanDonGian calculator = new TinhToanDonGian();
            calculator.setVisible(true);
        });
    }
}
