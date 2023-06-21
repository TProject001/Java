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

public class StudentMark extends JFrame{

	private JFrame frame;
	
	// custom variables
	private static ArrayList <String>data = new ArrayList<String>();
	private static int StudentId =0;

	/**
	 * Launch the application.
	 */
	public static void main(ArrayList <String>args,int sid) {
		data = args ;
		StudentId = sid;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMark window = new StudentMark();
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
	public StudentMark() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 631, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit_1.setBounds(520, 516, 80, 30);
		frame.getContentPane().add(btnExit_1);
		
		JLabel lblNewLabel = new JLabel("STUDENTS MARKS");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 30));
		lblNewLabel.setBounds(63, 26, 291, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name  :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(50, 100, 160, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("English");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(50, 210, 160, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Social Science");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(50, 260, 170, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mathematics");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(50, 310, 170, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Science");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1.setBounds(50, 360, 160, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 85, 580, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 410, 580, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 142, 580, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Language");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(50, 160, 160, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Student ID :");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1_2.setBounds(380, 100, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		String str = data.get(0);
		JLabel lblNewLabel_1_3 = new JLabel(str); // "Student Name field"
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(198, 100, 192, 30);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel(StudentId+"");  //"Student ID field"
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(507, 100, 80, 30);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		str = data.get(1);
		JLabel lblNewLabel_1_1_2_1 = new JLabel(str);  //"Languagemarks"
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(430, 160, 100, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		str = data.get(2);
		JLabel lblNewLabel_1_1_3 = new JLabel(str);  //"Englishmarks"
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(430, 210, 100, 30);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		str = data.get(3);
		JLabel lblNewLabel_1_1_1_2 = new JLabel(str);  //"Social Sciencemarks"
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(430, 260, 100, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		str = data.get(4);
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel(str);  //"Mathematicsmarks"
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2.setBounds(430, 300, 100, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		str = data.get(5);
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel(str);  //"Sciencemarks"
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(430, 340, 100, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Percent : ");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1_2.setBounds(220, 430, 100, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_2);
		 
		int TotalMarks =0;
		for(int i=1;i<data.size();i++) {
			TotalMarks += Integer.parseInt(data.get(i));
		}
		double Percent = TotalMarks/5;
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel(Percent+"");  //"Percentmarks"
		lblNewLabel_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1_1.setBounds(330, 430, 80, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2_1_1);
	}
}
