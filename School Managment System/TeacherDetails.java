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

public class TeacherDetails {

	private JFrame frame;
	private JTable table;
	
	//custom variables
	static private int AdminId = 0;  //= 1;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
	//	TeacherId = args ;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDetails window = new TeacherDetails();
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
	public TeacherDetails() {
		initialize();
		
		//Load data
		AdminDB.clearTeacherDetails(table);
		AdminDB.viewTeacherDetails(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 333, 190, 2);
		frame.getContentPane().add(separator);
		
		JButton btnRefresh = new JButton("Load");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Load data
				AdminDB.clearTeacherDetails(table);
				AdminDB.viewTeacherDetails(table);
			}
		});
		btnRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRefresh.setBounds(50, 20, 90, 40);
		frame.getContentPane().add(btnRefresh);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1059, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(166, 87, 879, 358);
		frame.getContentPane().add(scrollPane);
		
//		String[] ColName = {"sid","sname","class","gender","addrs","city","email","contact"};
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherRegister.main(AdminId);
		//		frame.dispose();
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBounds(35, 120, 100, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDeleteStudent = new JButton("Edit ");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				StudentEdit.main("Student Detail",AdminId);
//				frame.dispose();
				
//				if(StudentDB.studentDetailStatus(StudentId)) {
//					String data[] = StudentDB.studentDetail();
//					StudentDetail.main(data);
//				}
			}
		});
		btnDeleteStudent.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnDeleteStudent.setBounds(35, 190, 100, 40);
		frame.getContentPane().add(btnDeleteStudent);
		
		JButton btnDeleteStudent_1 = new JButton("Delete");
		btnDeleteStudent_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentEdit.main("Delete Teacher", AdminId);
//				StudentDelete.main(TeacherId);
//				frame.dispose();
			}
		});
		btnDeleteStudent_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnDeleteStudent_1.setBounds(35, 260, 100, 40);
		frame.getContentPane().add(btnDeleteStudent_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				TeacherPage.main(TeacherId);
//				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(46, 372, 85, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 87, 190, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("TEACHER DETAILS");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
		lblNewLabel.setBounds(299, 20, 400, 45);
		frame.getContentPane().add(lblNewLabel);
//		//add column to table
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.setColumnIdentifiers(ColName);
		
	}
}
