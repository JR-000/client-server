import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.io.*;
import java.net.*;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Client {
public class MainFrame extends JFrame {
private JPanel contentPane;
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
try{
Socket s=new Socket("localhost",8080);
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

// TAKING USER INPUT
System.out.print("\nEnter a Number : ");
int num = scan.nextInt();
// WRITING INTEGER TO SERVER
dout.writeInt(num);
String ans = (String)dis.readUTF();
System.out.println("\n"+num+
" Is Prime Number?: "+ans);
dout.flush();
dout.close();
s.close();
}
catch(Exception e){
System.out.println(e);
}
scan.close();
}
public MainFrame() {
	setTitle("Prime Numbers?");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	Label label = new Label("Please Enter a number");
	label.setFont(new Font("Dialog", Font.PLAIN, 10));
	label.setForeground(new Color(0, 128, 255));
	label.setBounds(10, 10, 164, 21);
	contentPane.add(label);
	
	TextField textField = new TextField();
	textField.setFont(new Font("Dialog", Font.PLAIN, 10));
	textField.setBounds(170, 10, 256, 21);
	contentPane.add(textField);
	
	Button button = new Button("Enter");
	button.setFont(new Font("Dialog", Font.BOLD, 10));
	button.setBounds(360, 56, 66, 21);
	contentPane.add(button);
	
	TextField textField_1 = new TextField();
	textField_1.setFont(new Font("Dialog", Font.PLAIN, 12));
	textField_1.setBounds(10, 83, 397, 170);
	contentPane.add(textField_1);
}
}
}