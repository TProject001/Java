import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class StudentDetail extends JFrame{
//"NameField","ClassField","GenderField","AddressField","CityField","EmailField","ContactField"
	private JFrame frame;
	//custom variable
	private static ArrayList<String> data;
	private static int StudentId;
	/**
	 * Launch the application.
	 */
	public static void main(ArrayList<String> data2) {
		data = data2;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetail window = new StudentDetail();
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
	public StudentDetail() {
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
		btnExit.setBounds(209, 507, 80, 35);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel(data.get(0));
		lblNewLabel_1_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1.setBounds(240, 90, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel(data.get(1));
		lblNewLabel_1_2_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_1.setBounds(240, 145, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2_1_2 = new JLabel(data.get(2));
		lblNewLabel_1_2_1_2_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_2.setBounds(240, 200, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_2_1_3 = new JLabel(data.get(3));
		lblNewLabel_1_2_1_2_1_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_3.setBounds(240, 255, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1_3);

		JLabel lblNewLabel_1_2_1_2_1_4 = new JLabel(data.get(4));
		lblNewLabel_1_2_1_2_1_4.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_4.setBounds(240, 310, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1_4);
		
		JLabel lblNewLabel_1_2_1_2_1_5 = new JLabel(data.get(5));
		lblNewLabel_1_2_1_2_1_5.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_5.setBounds(240, 365, 214, 40);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1_5);
		
		JLabel lblNewLabel_1_2_1_2_1_6 = new JLabel(data.get(6));
		lblNewLabel_1_2_1_2_1_6.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_6.setBounds(240, 420, 214, 35);
		frame.getContentPane().add(lblNewLabel_1_2_1_2_1_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(35, 478, 480, 2);
		frame.getContentPane().add(separator_2);
	}
}
