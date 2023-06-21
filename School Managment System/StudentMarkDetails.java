import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarkDetails {

	private JFrame frame;
	
	// custom variable
	private JTable table;
	private static int AdminId; //1

	/**
	 * Launch the application.
	 */
	public static void main(int ID) {
		AdminId = ID;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarkDetails window = new StudentMarkDetails();
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
	public StudentMarkDetails() {
		initialize();
		
		//load data 
		TeacherDB.clearStudentMarks(table);
		TeacherDB.viewStudentMarks(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 380, 178, 1);
		frame.getContentPane().add(separator);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBounds(44, 416, 90, 40);
		frame.getContentPane().add(btnExit);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 979, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRefresh = new JButton("Load");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherDB.clearStudentMarks(table);
				TeacherDB.viewStudentMarks(table);
			}
		});
		btnRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRefresh.setBounds(44, 115, 90, 40);
		frame.getContentPane().add(btnRefresh);
		
		JLabel lblStudentMarks = new JLabel("STUDENTS MARK");
		lblStudentMarks.setFont(new Font("Serif", Font.BOLD, 35));
		lblStudentMarks.setBounds(306, 26, 358, 45);
		frame.getContentPane().add(lblStudentMarks);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(178, 93, 793, 397);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 93, 178, 1);
		frame.getContentPane().add(separator);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Ids[] = {0 , AdminId};
				StudentMarksForm.main("Add",Ids);
//				TeacherDB.clearStudentMarks(table);
//				TeacherDB.viewStudentMarks(table);
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBounds(44, 183, 90, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//			StudentMarksForm.main(AdminId);
				StudentEdit.main("Student Mark",AdminId);
			}
		});
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEdit.setBounds(44, 254, 90, 40);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentEdit.main("Delete Mark", AdminId);
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBounds(44, 317, 90, 40);
		frame.getContentPane().add(btnDelete);
	}
}
