import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// name = Ritu , id = 1, pwd = 123
public class TeacherLogin extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherLogin window = new TeacherLogin();
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
	public TeacherLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEACHER LOGIN");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
		lblNewLabel.setBounds(130, 22, 300, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Teacher id");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(50, 100, 200, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(50, 165, 200, 40);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(250, 100, 250, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(250, 165, 250, 40);
		frame.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 87, 500, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 230, 500, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(231, 384, 85, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGIN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tid = Integer.parseInt( textField.getText() );
				String pwd = passwordField.getText();
				if(TeacherDB.valid(tid, SecurePassword.hash256(pwd))) {  //tid.contains("TEACHER") && pwd.contains("123")
			//		System.out.println(name+ " "+ pwd);
					JOptionPane.showMessageDialog(TeacherLogin.this,"Login successfully!");
					TeacherPage.main(tid);
					frame.dispose();
				}
				else {
//					System.out.println("Invalid Login Credential!");
					//JOptionPane.showMessageDialog it required extend from JFrame
					JOptionPane.showMessageDialog(TeacherLogin.this, "Sorry, Invalid Login Credential!","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Serif", Font.PLAIN, 28));
		btnNewButton_2.setBounds(205, 248, 150, 45);
		frame.getContentPane().add(btnNewButton_2);
	}
}
