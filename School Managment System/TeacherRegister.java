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

public class TeacherRegister extends JFrame{

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
	private static String gender_text = "Male";
	private ButtonGroup gendr = new ButtonGroup(); 
	private JTextField textField_7;
//	static String registrar_name = null;
	private static int RegistrarId ;

	/**
	 * Launch the application.
	 */
	public static void main(int args) { // String args
	//	registrar_name = args;
		RegistrarId = args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherRegister window = new TeacherRegister();
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
	public TeacherRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 982, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEACHER REGISTER");
		lblNewLabel.setBounds(365, 10, 400, 50);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(50, 90, 160, 35);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Salary");
		lblNewLabel_1_1.setBounds(50, 315, 182, 35);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(232, 90, 270, 35);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(645, 315, 270, 35);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 70, 900, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 380, 900, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setBounds(50, 145, 166, 35);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("City");
		lblNewLabel_1_2_1.setBounds(522, 145, 109, 35);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Department");
		lblNewLabel_1_2_1_1.setBounds(50, 255, 166, 35);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Address");
		lblNewLabel_1_2_1_1_1.setBounds(522, 90, 131, 35);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Gender");
		lblNewLabel_1_2_1_1_2.setBounds(50, 200, 200, 35);
		lblNewLabel_1_2_1_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_2);
		
		JRadioButton rdbtnFemale = new JRadioButton("");
		rdbtnFemale.setBounds(346, 200, 21, 30);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(239, 200, 21, 30);
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
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(rdbtnNewRadioButton);
		
	//	JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					rdbtnNewRadioButton.setSelected(false);
					gender_text = "FeMale";
			//		System.out.println(gender_text);
				}
			}
		});
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(rdbtnFemale);
		
		// Add button for JRadio
		gendr.add(rdbtnNewRadioButton);
		gendr.add(rdbtnFemale);
		
		textField_1 = new JTextField();
		textField_1.setBounds(232, 145, 270, 35);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 255, 270, 35);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(645, 90, 270, 35);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(645, 145, 270, 35);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Email");
		lblNewLabel_1_2_1_2.setBounds(522, 200, 120, 35);
		lblNewLabel_1_2_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Contact");
		lblNewLabel_1_2_1_3.setBounds(522, 255, 109, 35);
		lblNewLabel_1_2_1_3.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(645, 200, 270, 35);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(645, 255, 270, 35);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_2_1_1_3 = new JLabel("Male");
		lblNewLabel_1_2_1_1_3.setBounds(260, 200, 57, 35);
		lblNewLabel_1_2_1_1_3.setFont(new Font("Arial", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_3);
		
		JLabel lblNewLabel_1_2_1_1_3_1 = new JLabel("Female");
		lblNewLabel_1_2_1_1_3_1.setBounds(373, 200, 98, 35);
		lblNewLabel_1_2_1_1_3_1.setFont(new Font("Arial", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel_1_1_1.setBounds(518, 315, 182, 35);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(232, 315, 270, 35);
		frame.getContentPane().add(textField_7);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBounds(431, 407, 200, 45);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[] = new String[9];
				str[0] = textField.getText() + " "+ textField_1.getText(); //tname
				str[1] = gender_text;  // gender
				str[2]  = textField_2.getText(); //department
				str[3] = textField_7.getText(); // salary
				str[4]  = textField_3.getText(); // address
				str[5]  = textField_4.getText(); //city
				str[6]  = textField_5.getText(); //email
				str[7]  = textField_6.getText(); //contact
				str[8] = passwordField.getText();
				
				int i = AdminDB.addTeacher(str);
				System.out.println(i+"Good");
				if(i > 0) {
					JOptionPane.showMessageDialog(TeacherRegister.this,"Teacher Register successfully!");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					passwordField.setText(null);			}
				else {
					JOptionPane.showMessageDialog(TeacherRegister.this,"Sorry, Something went wrong!");
				}
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 28));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit_1.setBounds(866, 440, 80, 35);
		frame.getContentPane().add(btnExit_1);
	}
}
