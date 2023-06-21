import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class StudentMarksForm extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	// custom variables
	private static int TeacherId;
	private static int StudentId ;
	private static String PageName ;
	private static ArrayList<String> Mark = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String Page,int args[]) {
		PageName = Page;
		TeacherId = args[0];
		StudentId = args[1];
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarksForm window = new StudentMarksForm();
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
	public StudentMarksForm() {
		if(PageName == "Edit") {
			Mark = TeacherDB.getStudentMarks(StudentId);
		}
		else {
			Mark.add(""+0);
			Mark.add(""+0);
			Mark.add(""+0);
			Mark.add(""+0);
			Mark.add(""+0);
			Mark.add(""+0);
			Mark.add(""+0);
		}
		initialize();	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 433, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	//	
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int[] Ids =new int[2];
				String[] subs = new String[5];
				
				Ids[0] = Integer.parseInt(textField.getText());
				Ids[1] = TeacherId ;
				
				subs[0] = textField_1.getText();
				subs[1] = textField_2.getText();
				subs[2] = textField_3.getText();
				subs[3] = textField_4.getText();
				subs[4] = textField_5.getText();
//				System.out.println("lang "+subs[0]);
//				System.out.println("lang "+subs[1]);
//				System.out.println("lang "+subs[2]);
//				System.out.println("lang "+subs[3]);
//				System.out.println("lang "+subs[4]);
//				System.out.println(Ids[0]);  //student
//				System.out.println(Ids[1]);  //teacher
				
				// check if student and teacher is present in database or not
				if( TeacherDB.validatedStudentId(Ids[0]) ){ 
					//if marks present in makeResult update marks
					int i=0;
					if(TeacherDB.checkMarksPresentOrNot(Ids[0])) {
						i = TeacherDB.updateStudentMarks(subs,Ids[0]);
					}else {
					//if marks not present in makeResult table then add mark
					i = TeacherDB.addMarks(Ids , subs);
					}
					
					
					if(i > 0) {
						JOptionPane.showMessageDialog(StudentMarksForm.this,"Add Marks successfully!");
						textField.setText(null);
						textField_1.setText(null);
						textField_2.setText(null);
						textField_3.setText(null);
						textField_4.setText(null);
						textField_5.setText(null);
					}
					else {
						JOptionPane.showMessageDialog(StudentMarksForm.this,"Sorry, Something went wrong!");
					}
				}
				else {
					JOptionPane.showMessageDialog(StudentMarksForm.this,"Sorry, Something went wrong!");
				}
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 25));
		btnNewButton.setBounds(139, 435, 150, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit_1.setBounds(329, 516, 80, 30);
		frame.getContentPane().add(btnExit_1);
		
		JLabel lblNewLabel = new JLabel("STUDENTS MARKS");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 30));
		lblNewLabel.setBounds(63, 26, 291, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(100, 100, 100, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("English");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(50, 210, 160, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Social Science");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(50, 260, 170, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mathematics");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(50, 310, 170, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Science");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1.setBounds(50, 360, 160, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		String var = Mark.get(0);
		textField = new JTextField(var);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(208, 100, 124, 30);
		frame.getContentPane().add(textField);
		
		var = Mark.get(2);
		textField_1 = new JTextField(var);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(230, 160, 134, 30);
		frame.getContentPane().add(textField_1);
		
		var = Mark.get(3);
		textField_2 = new JTextField(var);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(230, 210, 134, 30);
		frame.getContentPane().add(textField_2);
		
		var = Mark.get(4);
		textField_3 = new JTextField(var);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(230, 260, 134, 30);
		frame.getContentPane().add(textField_3);
		
		var = Mark.get(5);
		textField_4 = new JTextField(var);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(230, 310, 134, 30);
		frame.getContentPane().add(textField_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 85, 370, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 410, 370, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 142, 370, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Language");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(50, 160, 160, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		var = Mark.get(6);
		textField_5 = new JTextField(var);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(230, 360, 134, 30);
		frame.getContentPane().add(textField_5);
	}
}
