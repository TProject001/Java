import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame{

	private JFrame frame;
	
	//custom variable
	private static int AdminId ; 

	/**
	 * Launch the application.
	 */
	public static void main(int id) {
		AdminId = id;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
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
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminPage = new JLabel("ADMIN PAGE");
		lblAdminPage.setFont(new Font("Serif", Font.BOLD, 35));
		lblAdminPage.setBounds(216, 10, 258, 50);
		frame.getContentPane().add(lblAdminPage);
		
		JButton btnNewButton_2 = new JButton("Details");
		btnNewButton_2.setFont(new Font("Serif", Font.PLAIN, 28));
		btnNewButton_2.setBounds(109, 150, 180, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Passwords");
		btnNewButton_2_1.setFont(new Font("Serif", Font.PLAIN, 28));
		btnNewButton_2_1.setBounds(335, 150, 180, 45);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Details");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetails.main(AdminId);
				frame.dispose();
			}
		});
		btnNewButton_2_2.setFont(new Font("Serif", Font.PLAIN, 28));
		btnNewButton_2_2.setBounds(94, 285, 180, 45);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_1_1 = new JButton("Passwords");
		btnNewButton_2_1_1.setFont(new Font("Serif", Font.PLAIN, 28));
		btnNewButton_2_1_1.setBounds(352, 285, 180, 45);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("Marks");
		btnNewButton_2_1_2.setFont(new Font("Serif", Font.PLAIN, 28));
		btnNewButton_2_1_2.setBounds(226, 349, 180, 45);
		frame.getContentPane().add(btnNewButton_2_1_2);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(483, 524, 85, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTeacher.setBounds(260, 90, 120, 50);
		frame.getContentPane().add(lblTeacher);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblStudent.setBounds(260, 225, 120, 50);
		frame.getContentPane().add(lblStudent);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 404, 544, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 78, 544, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(40, 229, 544, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(40, 78, 2, 328);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setBounds(582, 78, 2, 328);
		frame.getContentPane().add(separator_3_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 70, 610, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 412, 610, 2);
		frame.getContentPane().add(separator_5);
	}
}
