import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TeacherDetail extends JFrame{
//"NameField","ClassField","GenderField","AddressField","CityField","EmailField","ContactField"
	private JFrame frame;
	//custom variable
	private static ArrayList<String> Tdata;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	/**
	 * Launch the application.
	 */
	public static void main(ArrayList<String> args) {
		Tdata = args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDetail window = new TeacherDetail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeacherDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setBounds(89, 10, 360, 50);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name          : ");
		lblNewLabel_1.setBounds(70, 90, 200, 35);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 70, 480, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_2 = new JLabel("Department :");
		lblNewLabel_1_2.setBounds(70, 145, 200, 35);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Email           :");
		lblNewLabel_1_2_1.setBounds(70, 365, 200, 35);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Gender        :");
		lblNewLabel_1_2_1_1.setBounds(70, 200, 200, 35);
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("City             :");
		lblNewLabel_1_2_1_1_1.setBounds(70, 310, 200, 35);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);

		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Address       :");
		lblNewLabel_1_2_1_1_2.setBounds(70, 255, 200, 35);
		lblNewLabel_1_2_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Contact        :");
		lblNewLabel_1_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_2_1_2.setBounds(70, 420, 200, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(210, 552, 80, 35);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(35, 530, 480, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1_2_1_2_2 = new JLabel("Salary          :");
		lblNewLabel_1_2_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_2_1_2_2.setBounds(70, 475, 200, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_2);
		
		textField = new JTextField(Tdata.get(0));
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(270, 90, 214, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(Tdata.get(1));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(270, 145, 214, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField(Tdata.get(2));
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(270, 200, 214, 35);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField(Tdata.get(3));
		textField_3.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(270, 255, 214, 35);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField(Tdata.get(4));
		textField_4.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(270, 310, 214, 35);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField(Tdata.get(5));
		textField_5.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(270, 365, 214, 35);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField(Tdata.get(6));
		textField_6.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(270, 420, 214, 35);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField(Tdata.get(7));
		textField_7.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(270, 475, 214, 35);
		frame.getContentPane().add(textField_7);
	}
}
