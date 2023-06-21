import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("XYZ SCHOOL");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
		lblNewLabel.setBounds(187, 27, 280, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 25));
		btnNewButton.setBounds(260, 372, 110, 40);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 110, 575, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 341, 575, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdmin.setFont(new Font("Arial", Font.PLAIN, 30));
		btnAdmin.setBounds(200, 140, 250, 45);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnPrinciple = new JButton("Staff Login");
		btnPrinciple.setFont(new Font("Arial", Font.PLAIN, 30));
		btnPrinciple.setBounds(200, 210, 250, 45);
		frame.getContentPane().add(btnPrinciple);
		
		JButton btnPrinciple_1_1 = new JButton("Student Login");
		btnPrinciple_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		btnPrinciple_1_1.setBounds(200, 270, 250, 45);
		frame.getContentPane().add(btnPrinciple_1_1);
	}
}
