import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class StudentDetailEditForm extends JFrame{
//"NameField","ClassField","GenderField","AddressField","CityField","EmailField","ContactField"
	private JFrame frame;
	//custom variable
	private static ArrayList<String> data ;
	//private static int StudentId;
	/**
	 * Launch the application.
	 */
	public static void main(ArrayList<String> args) {
		data = args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetailEditForm window = new StudentDetailEditForm();
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
	public StudentDetailEditForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setBounds(89, 10, 360, 50);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name     : ");
		lblNewLabel_1.setBounds(70, 90, 142, 35);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 70, 480, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_2 = new JLabel("Class      :");
		lblNewLabel_1_2.setBounds(70, 145, 142, 35);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Email      :");
		lblNewLabel_1_2_1.setBounds(70, 365, 142, 35);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Gender   :");
		lblNewLabel_1_2_1_1.setBounds(70, 200, 142, 35);
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("City        :");
		lblNewLabel_1_2_1_1_1.setBounds(70, 310, 142, 35);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);

		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Address  :");
		lblNewLabel_1_2_1_1_2.setBounds(70, 255, 142, 35);
		lblNewLabel_1_2_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1_2_1_1_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Contact   :");
		lblNewLabel_1_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_2_1_2.setBounds(70, 420, 142, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(435, 570, 80, 35);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(35, 478, 480, 2);
		frame.getContentPane().add(separator_2);
		
		String var = data.get(0);
		JTextArea textArea = new JTextArea(var);
		textArea.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea.setBounds(240, 90, 214, 35);
		frame.getContentPane().add(textArea);
		
		var = data.get(1);
		JTextArea textArea_1 = new JTextArea(var);
		textArea_1.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea_1.setBounds(240, 145, 214, 35);
		frame.getContentPane().add(textArea_1);
		
		var = data.get(2);
		JTextArea textArea_2 = new JTextArea(var);
		textArea_2.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea_2.setBounds(240, 200, 214, 35);
		frame.getContentPane().add(textArea_2);
		
		var = data.get(3);
		JTextArea textArea_3 = new JTextArea(var);
		textArea_3.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea_3.setBounds(240, 255, 214, 35);
		frame.getContentPane().add(textArea_3);
		
		var = data.get(4);
		JTextArea textArea_4 = new JTextArea(var);
		textArea_4.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea_4.setBounds(240, 310, 214, 35);
		frame.getContentPane().add(textArea_4);
		
		var = data.get(5);
		JTextArea textArea_5 = new JTextArea(var);
		textArea_5.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea_5.setBounds(240, 365, 214, 35);
		frame.getContentPane().add(textArea_5);
		
		var = data.get(6);
		JTextArea textArea_6 = new JTextArea(var);
		textArea_6.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea_6.setBounds(240, 420, 214, 35);
		frame.getContentPane().add(textArea_6);
		
		JButton btnApplyChange = new JButton("APPLY CHANGE");
		btnApplyChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				System.out.println("changed data");
//			    System.out.println(textArea.getText());
//			    System.out.println(textArea_1.getText());
//			    System.out.println(textArea_2.getText());
//			    System.out.println(textArea_3.getText());
//			    System.out.println(textArea_4.getText());
//			    System.out.println(textArea_5.getText());
//			    System.out.println(textArea_6.getText());
//			    System.out.println("************");
				
//				set textField data to data variable
				data.set(0, ""+textArea.getText());
				data.set(1, ""+textArea_1.getText());
				data.set(2, ""+textArea_2.getText());
				data.set(3, ""+textArea_3.getText());
				data.set(4, ""+textArea_4.getText());
				data.set(5, ""+textArea_5.getText());
				data.set(6, ""+textArea_6.getText());
				int status = TeacherDB.updateStudentDetail(data);
				if(status>0) {
					JOptionPane.showMessageDialog(StudentDetailEditForm.this,"Successfully data updated !");
		//			System.out.println("Successfully update data");
					frame.dispose();
					StudentDetails.main(Integer.parseInt(data.get(8))); // at index 8 = TeacherId
				}
				else{
					System.out.println("Something went wrong");
				}
			}
		});
		btnApplyChange.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnApplyChange.setBounds(125, 490, 229, 35);
		frame.getContentPane().add(btnApplyChange);
	}
}
