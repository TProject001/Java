import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class StudentRegister extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	// custom 
	private String gender_text = "Male";
	private ButtonGroup gendr = new ButtonGroup(); 
	private static int registrarId;

	/**
	 * Launch the application.
	 */
	public static void main(int args) {
		registrarId = args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRegister window = new StudentRegister();
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
	public StudentRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTER");
		lblNewLabel.setBounds(120, 10, 360, 50);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(50, 90, 200, 35);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(50, 530, 225, 35);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(290, 90, 270, 35);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(290, 530, 270, 35);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(passwordField);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 70, 535, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 585, 535, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setBounds(50, 145, 200, 35);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("City");
		lblNewLabel_1_2_1.setBounds(50, 365, 214, 35);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Class");
		lblNewLabel_1_2_1_1.setBounds(50, 200, 200, 35);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Address");
		lblNewLabel_1_2_1_1_1.setBounds(50, 310, 200, 35);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Gender");
		lblNewLabel_1_2_1_1_2.setBounds(50, 255, 200, 35);
		lblNewLabel_1_2_1_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_2);
		
		JRadioButton rdbtnFemale = new JRadioButton("");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					rdbtnFemale.setSelected(false);
					gender_text = "Male";
				//	System.out.println(gender_text);
				}
			}
		});
		rdbtnNewRadioButton.setBounds(293, 255, 21, 30);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(rdbtnNewRadioButton);
		
	//	JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					rdbtnNewRadioButton.setSelected(false);
					gender_text = "Female";
			//		System.out.println(gender_text);
				}
			}
		});
		rdbtnFemale.setBounds(423, 255, 21, 30);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(rdbtnFemale);
		
		// Add button for JRadio
		gendr.add(rdbtnNewRadioButton);
		gendr.add(rdbtnFemale);
		
		textField_1 = new JTextField();
		textField_1.setBounds(290, 145, 270, 35);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(290, 200, 270, 35);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(290, 310, 270, 35);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(290, 365, 270, 35);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Email");
		lblNewLabel_1_2_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1_2_1_2.setBounds(50, 420, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Contact No.");
		lblNewLabel_1_2_1_3.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1_2_1_3.setBounds(50, 475, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(290, 420, 270, 35);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(290, 475, 270, 35);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_2_1_1_3 = new JLabel("Male");
		lblNewLabel_1_2_1_1_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_2_1_1_3.setBounds(320, 255, 57, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_1_3);
		
		JLabel lblNewLabel_1_2_1_1_3_1 = new JLabel("Female");
		lblNewLabel_1_2_1_1_3_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_2_1_1_3_1.setBounds(452, 255, 98, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_1_3_1);
		
// sname,class,gender,addrs,city,email,contact,registarName,spassword
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBounds(196, 603, 200, 45);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[] = new String[8];
				str[0] = textField.getText() + " "+textField_1.getText(); //sname
				str[1] = textField_2.getText(); // stclass
				str[2] = gender_text;  // gender
				str[3]  = textField_3.getText(); // address
				str[4]  = textField_4.getText(); //city
				str[5]  = textField_5.getText(); //email
				str[6]  = textField_6.getText(); //contact
				str[7] = passwordField.getText();
				
				int i = TeacherDB.addStudent(str,registrarId);
		//		System.out.println(i+"Good");
				if(i > 0) {
					JOptionPane.showMessageDialog(StudentRegister.this,"Student Register successfully!");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					passwordField.setText(null);			}
				else {
					JOptionPane.showMessageDialog(StudentRegister.this,"Sorry, Something went wrong!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 28));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(502, 631, 80, 35);
		frame.getContentPane().add(btnExit);
	}
}
