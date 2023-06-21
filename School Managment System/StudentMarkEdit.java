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

public class StudentMarkEdit extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	// custom variables
	private static ArrayList<String> data;
	/**
	 * Launch the application.
	 */
	public static void main(ArrayList<String> Marks) {
		data = Marks;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarkEdit window = new StudentMarkEdit();
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
	public StudentMarkEdit() {
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
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int[] Ids =new int[2];
				String[] subs = new String[5];
				
				Ids[0] = Integer.parseInt(textField.getText());
				
				subs[0] = textField_1.getText();
				subs[1] = textField_2.getText();
				subs[2] = textField_3.getText();
				subs[3] = textField_4.getText();
				subs[4] = textField_5.getText();
				System.out.println("lang "+subs[0]);
				System.out.println("lang "+subs[1]);
				System.out.println("lang "+subs[2]);
				System.out.println("lang "+subs[3]);
				System.out.println("lang "+subs[4]);
				System.out.println(Ids[0]);
				System.out.println(Ids[1]);
				
				int i = TeacherDB.addMarks(Ids , subs);
				if(i > 0) {
					JOptionPane.showMessageDialog(StudentMarkEdit.this,"Add Marks successfully!");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null); 
			}
				else {
					JOptionPane.showMessageDialog(StudentMarkEdit.this,"Sorry, Something went wrong!");
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
		
		String var = data.get(0);
		textField = new JTextField(var);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(208, 100, 124, 30);
		frame.getContentPane().add(textField);
		
		var = data.get(2);
		textField_1 = new JTextField(var);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(230, 160, 134, 30);
		frame.getContentPane().add(textField_1);
		
		var = data.get(3);
		textField_2 = new JTextField(var);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(230, 210, 134, 30);
		frame.getContentPane().add(textField_2);
		
		var = data.get(4);
		textField_3 = new JTextField(var);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(230, 260, 134, 30);
		frame.getContentPane().add(textField_3);
		
		var = data.get(5);
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
		
		var = data.get(6);
		textField_5 = new JTextField(var);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(230, 360, 134, 30);
		frame.getContentPane().add(textField_5);
	}
}
