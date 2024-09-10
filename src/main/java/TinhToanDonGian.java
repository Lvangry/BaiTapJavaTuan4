/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class TinhToanDonGian {

    private JLabel lb1,lb2,lb3;
    private JTextField txtSo1,txtSo2,txtKq;
    private JButton btCong,btTru,btNhan,btChia; 
    
    public TinhToanDonGian(){
    setTitle("Tinh toan don gian");
    taoGiaoDien();
    setSize(400,300);
    pack();
    setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TinhToanDonGian frm=new TinhToanDonGian();
        frm.setVisible(true);
    }
    private void taoGiaoDien(){
    JPanel p1=new JPanel();
    p1.setLayout(new GridLayout(3,2,5,5));
    p1.add(lb1=new JPanel("So 1"));
    p1.add(txtSo1=new JTextField());
    p1.add(lb2=new JLabel("So 2"));
    p1.add(txtSo2=new JTextField() );
    p1.add(lb3=new JLabel("Ket qua"));
    p1.add(txtKq=new JTextField());
    
    JPanel p2=new JPanel();
    p2.add(btCong=new JButton("Cong"));
    p2.add(btTru=new JButton("Tru"));
    p2.add(btNhan=new JButton("Nhan"));
    p2.add(btChia=new JButton("CHia"));
    
    setLayout(new BorderLayout());
    add(p1,BorderLayout.CENTER);
    add(p2,BorderLayout.SOUTH);
    
    
    
    }
    
}
