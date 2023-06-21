import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class StudentPage {

	private JFrame frame;
	private static int StudentId;

	/**
	 * Launch the application.
	 */
	public static void main(int sid) {
		StudentId = sid;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPage window = new StudentPage();
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
	public StudentPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentPage = new JLabel("STUDENT PAGE");
		lblStudentPage.setFont(new Font("Serif", Font.BOLD, 35));
		lblStudentPage.setBounds(110, 26, 288, 50);
		frame.getContentPane().add(lblStudentPage);
		
		JButton btnMyInformation = new JButton("My Information");
		btnMyInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> data = StudentDB.studentDetail(StudentId);
				StudentDetail.main(data);
			}
		});
		btnMyInformation.setFont(new Font("Arial", Font.PLAIN, 25));
		btnMyInformation.setBounds(120, 120, 250, 45);
		frame.getContentPane().add(btnMyInformation);
		
		JButton btnMarks = new JButton("Marks");
		btnMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> Data = StudentDB.studentMarkView(StudentId);
				StudentMark.main(Data, StudentId);
			}
		});
		btnMarks.setFont(new Font("Arial", Font.PLAIN, 25));
		btnMarks.setBounds(120, 185, 250, 45);
		frame.getContentPane().add(btnMarks);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLogin.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(199, 332, 85, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 100, 400, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 252, 400, 2);
		frame.getContentPane().add(separator_1);
	}
}
