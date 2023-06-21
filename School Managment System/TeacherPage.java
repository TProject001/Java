import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TeacherPage extends JFrame{

	private JFrame frame;
	private static int TeacherId ;
	/**
	 * Launch the application.
	 */
	public static void main(int arg) {
		TeacherId = arg;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherPage window = new TeacherPage();
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
	public TeacherPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentPage = new JLabel("TEACHER PAGE");
		lblStudentPage.setFont(new Font("Serif", Font.BOLD, 35));
		lblStudentPage.setBounds(130, 24, 291, 50);
		frame.getContentPane().add(lblStudentPage);
		
		JButton btnMyInformation = new JButton("My Details");
		btnMyInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> data = TeacherDB.teacherDetail(1);
				TeacherDetail.main(data);
			}
		});
		btnMyInformation.setFont(new Font("Arial", Font.PLAIN, 30));
		btnMyInformation.setBounds(100, 120, 340, 45);
		frame.getContentPane().add(btnMyInformation);
		
		JButton btnMarks = new JButton("Student Details");
		btnMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetails.main(TeacherId);
				frame.dispose();
			}
		});
		btnMarks.setFont(new Font("Arial", Font.PLAIN, 30));
		btnMarks.setBounds(100, 185, 340, 45);
		frame.getContentPane().add(btnMarks);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherLogin.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(212, 394, 85, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 100, 450, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 331, 450, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnFillStudentMarks = new JButton("Student Marks");
		btnFillStudentMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentMarkDetails.main(TeacherId);
			}
		});
		btnFillStudentMarks.setFont(new Font("Arial", Font.PLAIN, 30));
		btnFillStudentMarks.setBounds(100, 253, 340, 45);
		frame.getContentPane().add(btnFillStudentMarks);
	}
}
