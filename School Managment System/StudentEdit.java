import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;

public class StudentEdit extends JFrame {
	static StudentEdit frame;
	private JPanel contentPane;
	private JTextField textField;

	//custom
	static private int TeacherId;
	static private String PageName = "page";
//	static private String var = "Enter Student Id   :";
	
	/**
	 * Launch the application.
	 */
	public static void main(String Page,int args) {
		PageName = Page;
		TeacherId = args;
//		String var = "Enter Student Id   :";
//		System.out.println("Pagename is "+PageName);
//		if(PageName.contains("Delete Teacher")) {
//			var = "Enter Teacher Id   :";
//			System.out.println("Inside var");
//		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentEdit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentEdit() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Set label value based on input
		String var = "Enter Student Id   :";
		if(PageName == "Delete Teacher") {
			var = "Enter Teacher Id   :";
		}
		
		JLabel lblEnterId = new JLabel(var); // "Enter Student Id   :"
		lblEnterId.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("SUBMIT");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String sid= textField.getText();
				ArrayList<String> data;
	//			System.out.println("Page : "+PageName);
				if(sid==null||sid.equals("")){
					JOptionPane.showMessageDialog(StudentEdit.this,"Id can't be blank");
				}
				else {
					int id=Integer.parseInt(sid);
					int Ids[] = {TeacherId,id};
					
		//				System.out.println("1Page : "+PageName);
					switch(PageName) {
					    case "Delete Teacher":
					    	System.out.println("Inside Delete Teacher");
					    	int i = AdminDB.deleteTeacher(id);
							if(i>0){
								JOptionPane.showMessageDialog(StudentEdit.this, "Teacher Detail deleted Successfully!");
							}
							else {
								JOptionPane.showMessageDialog(StudentEdit.this,"Sorry , Something went wrong","Data Delete Error!",JOptionPane.ERROR_MESSAGE);
							}
						break;
						
					    case "Edit Teacher":
					    	System.out.println("Inside Edit Teacher");
					    	int i1 = AdminDB.updateTeacherDetail(id);
							if(i1>0){
								JOptionPane.showMessageDialog(StudentEdit.this, "Teacher Detail updates Successfully!");
							}
							else {
								JOptionPane.showMessageDialog(StudentEdit.this,"Sorry , Something went wrong","Data Delete Error!",JOptionPane.ERROR_MESSAGE);
							}
						break;
							
						case "Student Detail":
							if(TeacherDB.validatedStudentId(id)) {
								data = StudentDB.studentDetail(id);
								data.add(sid);           // set at index 7
								data.add(TeacherId+"");  //set at index 8
								JOptionPane.showMessageDialog(StudentEdit.this,"Open Student Edit Form successfully!");
								StudentDetailEditForm.main(data);	
							}
							else {
								JOptionPane.showMessageDialog(StudentEdit.this, "Sorry, Invalid Login Credential!","Data Edit Error!",JOptionPane.ERROR_MESSAGE);
							}
							break;
						
						case "Student Mark":
							if(TeacherDB.validatedStudentId(id)) {
		//						System.out.println("2Page : "+PageName+" , id = "+id);
		//						data = TeacherDB.getStudentMarks(id);	
								StudentMarksForm.main("Edit",Ids);
							}
							else {
								JOptionPane.showMessageDialog(StudentEdit.this, "Sorry, Invalid Login Credential!","Data Edit Error!",JOptionPane.ERROR_MESSAGE);
							}
						break;
						case "Delete Mark":
							if(TeacherDB.validatedStudentId(id)) {
								int i11 = TeacherDB.deleteStudentMarks(id);
								if(i11>0){
									JOptionPane.showMessageDialog(StudentEdit.this, "Student Mark deleted Successfully!");
								}
								else {
									JOptionPane.showMessageDialog(StudentEdit.this,"Sorry , Something went wrong","Data Delete Error!",JOptionPane.ERROR_MESSAGE);
								}
							} 
							else {
								JOptionPane.showMessageDialog(StudentEdit.this, "Sorry, Invalid Login Credential!","Data Edit Error!",JOptionPane.ERROR_MESSAGE);
							}	
			          }
	        	}
				frame.dispose();
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//			TeacherDetails.main(new String[]{});
	//			StudentDetails.main(TeacherId);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(36))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEnterId, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDelete)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addGap(86))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(52, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterId, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(60)
					.addComponent(btnNewButton)
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
