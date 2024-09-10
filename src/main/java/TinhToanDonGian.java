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
//import javax.swing.*;
//import java.awt .event. *;
//import java.awt.*;
//
//public class TinhToanDonGian extends JFrame implements ActionListener (){ 
///*Dùng để biểu diễn 4 nút của 4 phép toán +, -, *, / */
//	private JButton bt1, bt2, bt3, bt4;
//	/*Dùng để chứa 2 số và 1 kết quả*/
//	private JTextField tf1, tf2, tf3;
//	/*Dùng để lưu trữ kết quả tính toán*/
//	private double result;
//	/*Dùng để nhận tầng ContentPane của JFrame*/
//	private Container cont;
//	/*Dùng để nhóm các thành phần trên giao diện*/
//	private JPanel panel1, panel2;
//        /*Hàm khởi tạo*/
//	public TinhToanDonGian(String s)
//	{ 
//		super(s);
//		/*Lấy lớp ContentPane để đặt các đối tượng hiển thị*/
//		cont = this.getContentPane(); 
//		
//		/*Tạo các thành phần trên giao diện*/
//		JLabel num1lb = new JLabel("Num1: ");
//		tf1 = new JTextField();
//		JLabel num2lb = new JLabel("Num2: ");
//		tf2 = new JTextField();
//		JLabel resultlb = new JLabel("Result: ");
//		tf3 = new JTextField();
//		/*Textfield chứa kết quả không được phép sử dụng dữ liệu*/
//		tf3.setEditable(false);
//		
//		/*Panel1 chứa 3 Textfield*/
//		panel1 = new JPanel(); 
//		/*thiết lập Layout gồm 3 hàng 2 cột*/
//		panel1.setLayout(new GridLayout(3,2));
//		/*Đặt các thành phần vào panel 1*/
//		panel1.add(num1lb); 
//		panel1.add(tf1); 
//		panel1.add(num2lb); 
//		panel1.add(tf2);
//		panel1.add(resultlb);
//		panel1.add(tf3);
//		/*Tạo 4 nút biểu diễn 4 phép toán*/
//		bt1 = new JButton("+");
//		bt2= new JButton("-");
//		bt3 = new JButton("*");
//		bt4 = new JButton("/");
//		/*Panel2 chứa 4 nút*/
//		panel2 = new JPanel();
//		panel2.add(bt1);
//		panel2.add(bt2);
//		panel2.add(bt3);
//		panel2.add(bt4);
//		
//		/*Đặt 2 panel vào ContentPane*/
//		cont.add(panel1); 
//		cont.add(panel2,"South"); 
//		
//		bt1.addActionListener(this);
//		bt2.addActionListener(this); 
//		bt3.addActionListener(this); 
//		bt4.addActionListener(this);
//		/*Thiết lập kích thước hiển thị*/
//		this.pack();
//		this.setVisible(true);
//	}
////Định nghĩa các hàm cộng, trừ, nhân, chia
//
//	/*Định nghĩa hàm cộng*/
//	public void doPlus() 
//	{ 
//	   result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()); 
//	   tf3.setText(String.valueOf(result)); 
//	}
//	/*Định nghĩa hàm trừ*/
//	public void doMinus() 
//	{ 
//		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
//		tf3.setText(String.valueOf(result));
//	}
//	/*Định nghĩa hàm nhân*/
//	public void doMult() 
//	{
//		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
//		tf3.setText(String.valueOf(result)); 
//	}
//	/*Định nghĩa hàm chia*/
//	public void doDiv()
//	{
//	    result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
//	    tf3.setText(String.valueOf(result));
//	}
////Định nghĩa lại hàm xử lý khi người dùng ấn các phép toán
//
//	/*Định nghĩ lại hàm xử lý khi người dùng ấn các nút phép toán*/
//	public void actionPerformed(ActionEvent e) 
//	{ 
//		if (e.getActionCommand()=="+")
//		doPlus();
//		if (e.getActionCommand()=="-")
//		doMinus();
//		if (e.getActionCommand()=="*")
//		doMult();
//		if (e.getActionCommand()=="/")
//		doDiv();
//	
//	}
////Và cuối cùng là hàm main
//
//	public static void main(String args[])
//	{
//		/*Tạo giao diện chương trình*/
//		TinhToanDonGian simpleCalculator = new STinhToanDonGian("SimpleCalculator");
//		simpleCalculator.setLocationRelativeTo(null);
//	}


import javax.swing.*;
import java.awt .event. *;
import java.awt.*; 

public class TinhToanDonGian extends JFrame implements ActionListener { 
	
	/*Dùng để biểu diễn 4 nút của 4 phép toán +, -, *, / */
	private JButton bt1, bt2, bt3, bt4;
	/*Dùng để chứa 2 số và 1 kết quả*/
	private JTextField tf1, tf2, tf3;
	/*Dùng để lưu trữ kết quả tính toán*/
	private double result;
	/*Dùng để nhận tầng ContentPane của JFrame*/
	private Container cont;
	/*Dùng để nhóm các thành phần trên giao diện*/
	private JPanel panel1, panel2;

	/*Hàm khởi tạo*/
	public TinhToanDonGian(String s)
	{ 
		super(s);
		/*Lấy lớp ContentPane để đặt các đối tượng hiển thị*/
		cont = this.getContentPane(); 
		
		/*Tạo các thành phần trên giao diện*/
		JLabel num1lb = new JLabel("Num1: ");
		tf1 = new JTextField();
		JLabel num2lb = new JLabel("Num2: ");
		tf2 = new JTextField();
		JLabel resultlb = new JLabel("Result: ");
		tf3 = new JTextField();
		/*Textfield chứa kết quả không được phép sử dụng dữ liệu*/
		tf3.setEditable(false);
		
		/*Panel1 chứa 3 Textfield*/
		panel1 = new JPanel(); 
		/*thiết lập Layout gồm 3 hàng 2 cột*/
		panel1.setLayout(new GridLayout(3,2));
		/*Đặt các thành phần vào panel 1*/
		panel1.add(num1lb); 
		panel1.add(tf1); 
		panel1.add(num2lb); 
		panel1.add(tf2);
		panel1.add(resultlb);
		panel1.add(tf3);
		/*Tạo 4 nút biểu diễn 4 phép toán*/
		bt1 = new JButton("+");
		bt2= new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		/*Panel2 chứa 4 nút*/
		panel2 = new JPanel();
		panel2.add(bt1);
		panel2.add(bt2);
		panel2.add(bt3);
		panel2.add(bt4);
		
		/*Đặt 2 panel vào ContentPane*/
		cont.add(panel1); 
		cont.add(panel2,"South"); 
		
		bt1.addActionListener(this);
		bt2.addActionListener(this); 
		bt3.addActionListener(this); 
		bt4.addActionListener(this);
		/*Thiết lập kích thước hiển thị*/
		this.pack();
		this.setVisible(true);
	}

	/*Định nghĩa hàm cộng*/
	public void doPlus() 
	{ 
	   result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()); 
	   tf3.setText(String.valueOf(result)); 
	}
	/*Định nghĩa hàm trừ*/
	public void doMinus() 
	{ 
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	/*Định nghĩa hàm nhân*/
	public void doMult() 
	{
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result)); 
	}
	/*Định nghĩa hàm chia*/
	public void doDiv()
	{
	    result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
	    tf3.setText(String.valueOf(result));
	} 
	
	/*Định nghĩ lại hàm xử lý khi người dùng ấn các nút phép toán*/
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getActionCommand()=="+")
		doPlus();
		if (e.getActionCommand()=="-")
		doMinus();
		if (e.getActionCommand()=="*")
		doMult();
		if (e.getActionCommand()=="/")
		doDiv();
	
	}
	
	public static void main(String args[])
	{
		/*Tạo giao diện chương trình*/
		TinhToanDonGian simpleCalculator = new TinhToanDonGian("SimpleCalculator");
		simpleCalculator.setLocationRelativeTo(null);
	}
}

