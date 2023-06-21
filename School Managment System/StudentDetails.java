import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class StudentDetails {

	private JFrame frame;
	private JTable table;
	
	//custome
	static private int TeacherId ;  //= 1;

	/**
	 * Launch the application.
	 */
	public static void main(int args) {
		TeacherId = args ;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails window = new StudentDetails();
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
	public StudentDetails() {
		initialize();
		
		//Load data
		TeacherDB.clearStudentDetails(table);
		TeacherDB.viewStudentDetails(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 333, 190, 2);
		frame.getContentPane().add(separator);
		
		JButton btnRefresh = new JButton("Load");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Load data
				TeacherDB.clearStudentDetails(table);
				TeacherDB.viewStudentDetails(table);
			}
		});
		btnRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnRefresh.setBounds(50, 20, 90, 40);
		frame.getContentPane().add(btnRefresh);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 950, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(188, 87, 748, 350);
		frame.getContentPane().add(scrollPane);
		
//		String[] ColName = {"sid","sname","class","gender","addrs","city","email","contact"};
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add Student");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentRegister.main(TeacherId);
		//		frame.dispose();
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnAdd.setBounds(10, 120, 170, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDeleteStudent = new JButton("Edit Data");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentEdit.main("Student Detail",TeacherId);
				frame.dispose();
				
//				if(StudentDB.studentDetailStatus(StudentId)) {
//					String data[] = StudentDB.studentDetail();
//					StudentDetail.main(data);
//				}
			}
		});
		btnDeleteStudent.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnDeleteStudent.setBounds(10, 190, 170, 40);
		frame.getContentPane().add(btnDeleteStudent);
		
		JButton btnDeleteStudent_1 = new JButton("Delete Student");
		btnDeleteStudent_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDelete.main(TeacherId);
				frame.dispose();
			}
		});
		btnDeleteStudent_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnDeleteStudent_1.setBounds(10, 260, 170, 40);
		frame.getContentPane().add(btnDeleteStudent_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherPage.main(TeacherId);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(46, 372, 85, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 87, 190, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
		lblNewLabel.setBounds(299, 20, 400, 45);
		frame.getContentPane().add(lblNewLabel);
//		//add column to table
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.setColumnIdentifiers(ColName);
		
	}
}
