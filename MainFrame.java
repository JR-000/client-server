import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.Button;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
