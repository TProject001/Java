import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TeacherDB { 
	
	public static void main(String[] args) {
//		int a = TeacherDB.deleteStudent(6);
//		if(a==1) {
//			System.out.println("Delete Succesfully");
//		}
//		else {
//			System.out.println("Something went wrong.");
//		}
//		TeacherDB.viewStudentDetails();
//		ArrayList<String> data = TeacherDB.teacherDetail(1);
//		System.out.println(data);
	}
	// method for validating teacher login
	
	public static boolean valid(int TeacherId,String pwd) {
		boolean status = false;
		try {
			Connection conn = DB.getConnection();
			String query = "SELECT * FROM teacher where tid=(?) AND tpassword=(?);";
			PreparedStatement ps =conn.prepareStatement(query);
			ps.setInt(1, TeacherId);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		}catch(Exception e) { System.out.println(e); }
		return status;
	}
	
	public static ArrayList<String> teacherDetail(int tid) {
		ArrayList<String> TData = new ArrayList<String>();
	//	boolean status = false;
		try {
			Connection con = DB.getConnection();
			String query = "SELECT tname,dept,gender,addrs,city,email,contact,salary from teacher where tid=(?);";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, tid);
			ResultSet rs = ps.executeQuery();
		//	status = rs.next();
			if(rs.next()) {  //status
				for(int i=1;i<9;i++) {
					TData.add(rs.getString(i));
				}
			}
			con.close();
		}catch(Exception e) { System.out.println(e); }
		return TData;
	} 

	public static int updateStudentDetail(ArrayList<String> data) {
	//	ArrayList<String> TData = new ArrayList<String>();
	//	boolean status = false;
		int status = 0;
		try {
			Connection con = DB.getConnection();
			String query = "update student set sname = (?),class = (?),gender = (?),addrs = (?),city = (?),email = (?),contact = (?) 	where sid=(?);";
			PreparedStatement ps = con.prepareStatement(query);
			for(int i=1;i<8;i++) {
				ps.setString(i,data.get(i-1));
				System.out.println(data.get(i-1));
			}
			ps.setInt(8, Integer.parseInt(data.get(7)));
			status = ps.executeUpdate();
		//	status = rs.next();
			con.close();
		//	System.out.println("Updated successfully !");
		}catch(Exception e) { System.out.println(e); }
		return status;
	} 
	
	
//	public static ArrayList<String> editStudentDetail(int tid) {
//		ArrayList<String> TData = new ArrayList<String>();
//	//	boolean status = false;
//		try {
//			Connection con = DB.getConnection();
//			String query = "SELECT tname,dept,gender,addrs,city,email,contact,salary from teacher where tid=(?);";
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setInt(1, tid);
//			ResultSet rs = ps.executeQuery();
//		//	status = rs.next();
//			if(rs.next()) {  //status
//				for(int i=1;i<9;i++) {
//					TData.add(rs.getString(i));
//				}
//			}
//			con.close();
//			//
//			try {
//				Connection con = DB.getConnection();
//				String query = "SELECT sname,class,gender,addrs,city,email,contact from student where sid=(?) ;";
//				PreparedStatement ps = con.prepareStatement(query);
//				ps.setInt(1, Sid);
//				ResultSet rs = ps.executeQuery();
//				status = rs.next();
//				if(status) {
//					for(int i=1;i<8;i++) {
//						StData[i-1] = rs.getString(i);
//					}
//				}
//			//
//		}catch(Exception e) { System.out.println(e); }
//		return TData;
//	} 
	
	public static boolean validatedStudentId(int sid) {
		Connection conn = DB.getConnection();
		// check if student and teacher is present in database or not
		try {
		String query = "SELECT * FROM student where sid=(?)";
		PreparedStatement ps1 =conn.prepareStatement(query);
		ps1.setInt(1, sid);
		ResultSet rs = ps1.executeQuery();
		return rs.next();
		}catch(Exception e) { System.out.println(e); }
		return false;
	}
	public static void viewStudentDetails(JTable table) {  //JTable table
	//	ArrayList<String> Sdatas = new ArrayList<String>();
		try {
			Connection conn = DB.getConnection();
			String query = "SELECT sid,sname,class,gender,addrs,city,email,contact from student";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
//			ResultSetMetaData rsmd = rs.getMetaData();
			
			//Add Column
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			//error for getting column name
//			
//			int cols = rsmd.getColumnCount();
//			System.out.println("Colmn : "+cols);
//			String[] colName = new String[cols];
//			for(int i=0;i<cols;i++) {
//				colName[i] = rsmd.getColumnName(i+1);
//				System.out.println(colName);
//			}
//	//		model.setColumnIdentifiers(colName);
			
			String[] ColName = {"sid","sname","class","gender","addrs","city","email","contact"};
			//add column to table
	//		DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setColumnIdentifiers(ColName);
			//Add Rows
			String[] SDatas = new String[8]; 
			while(rs.next()) {
				SDatas[0] = rs.getInt(1) + ""; 
				for(int i=2;i<=8;i++) {
					SDatas[i-1] = rs.getString(i);
				}
				model.addRow(SDatas);
			}
		}catch(Exception e) { System.out.println(e); }
	} 
	
	public static void clearStudentDetails(JTable table) {
		table.setModel(new DefaultTableModel());
	}
	
	public static int addStudent(String[] str,int RegisterId) {
		int status=0;
	//	String query="INSERT INTO student(sname,class,gender,addrs,city,email,contact,registarName,spassword) VALUES(?,?,?,?,?,?,?,?,?)";//sha2('123',256)
		String query="insert into student(sname,class,gender,addrs,city,email,contact,registrarId,spassword ) value(?,?,?,?,?,?,?,?,?)";
		try {
			Connection conn = DB.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, str[0]);
			ps.setString(2, str[1]);
			ps.setString(3, str[2]);
			ps.setString(4, str[3]);
			ps.setString(5, str[4]);
			ps.setString(6, str[5]);
			ps.setString(7, str[6]);
			ps.setInt(8, RegisterId);
			ps.setString(9, SecurePassword.hash256(str[7]));
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e) {System.out.println(e);}
		return status;
	}
	static public int deleteStudent(int Sid) {
		int status = 0;
		try {
			Connection conn = DB.getConnection();
			String query = "DELETE FROM student WHERE sid=(?) ;";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, Sid);
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e) { System.out.println(e); }
		return status ;
	}
	
	// Student marks details
	public static void viewStudentMarks(JTable table) {  //JTable table
	
			try {
				Connection conn = DB.getConnection();
				String query = "select * from studentMarks;";
				PreparedStatement ps = conn.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				
				//Add Column
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				//Add column
				int cols = rsmd.getColumnCount();
		//		System.out.println("Colmn : "+cols);
				String[] colName = new String[cols];
				for(int i=0;i<cols;i++) {
					colName[i] = rsmd.getColumnName(i+1);
				}
				model.setColumnIdentifiers(colName);
				//Add Rows
				String[] SDatas = new String[7]; 
				while(rs.next()) { 
					for(int i=1;i<=7;i++) {
						SDatas[i-1] = rs.getString(i);
					}
					model.addRow(SDatas);
				}
//				String[] ColName = {"sid","sname","class","gender","addrs","city","email","contact"};
				//add column to table
//		//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//				model.setColumnIdentifiers(ColName);
//				//Add Rows
//				String[] SDatas = new String[8]; 
//				while(rs.next()) {
//					SDatas[0] = rs.getInt(1) + ""; 
//					for(int i=2;i<=8;i++) {
//						SDatas[i-1] = rs.getString(i);
//					}
//					model.addRow(SDatas);
//				}
			}catch(Exception e) { System.out.println(e); }
		} 
	
	public static void clearStudentMarks(JTable table) {
		table.setModel(new DefaultTableModel());
	}
	public static int addMarks(int[] Ids,String[] subs) {
		int status=0;
	//	String query="insert into makeResult(sid,slanguage,english,socialscience,mathematics,science,tid) values(?,?,?,?,?,?,?)";
		try {
			Connection conn = DB.getConnection();
			String query="insert into makeResult(sid,slanguage,english,socialscience,mathematics,science,tid) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, Ids[0]);   //sid
			ps.setString(2, subs[0]);
			ps.setString(3, subs[1]);
			ps.setString(4, subs[2]);
			ps.setString(5, subs[3]);
			ps.setString(6, subs[4]);
			ps.setInt(7, Ids[1]);  //tid
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e) {System.out.println(e);}
		return status;
	}
	public static ArrayList<String> getStudentMarks(int sid) {
		ArrayList<String> Mark = new ArrayList<String>();
		String query = "Select * from studentMarks where sid=(?)";
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
		//	status = rs.next();
			if(rs.next()) {  //status
				for(int i=1;i<8;i++) {
					Mark.add(rs.getString(i));
				}
			}
		}catch(Exception e) { System.out.println(e); }
		return Mark;
	}
	public static boolean checkMarksPresentOrNot(int sid) {
		try {
			Connection conn = DB.getConnection();
			String query = "select * from makeResult where sid = (?);";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
			return rs.next();
		}catch(Exception e) { System.out.println(e); }
		return false;
	}
	
	public static int updateStudentMarks(String data[],int sid) {
		//	ArrayList<String> TData = new ArrayList<String>();
		//	boolean status = false;
			int status = 0;
			try {
				Connection con = DB.getConnection();
				String query = "update makeResult set slanguage = (?),english = (?),socialscience = (?),mathematics=(?),science=(?) where sid = (?);";
				PreparedStatement ps = con.prepareStatement(query);
				for(int i=1;i<6;i++) {
					ps.setString(i,data[i-1]);
//					System.out.println(data[i-1]);
				}
				ps.setInt(6, sid);
				status = ps.executeUpdate();
			//	status = rs.next();
				con.close();
			//	System.out.println("Updated successfully !");
			}catch(Exception e) { System.out.println(e); }
			return status;
		} 
	public static int deleteStudentMarks(int sid) {
		try {
			Connection conn = DB.getConnection();
			String query = "Delete from makeResult where sid = (?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, sid);
			return ps.executeUpdate();
		}catch(Exception e) { System.out.println(e);}
		return 0;
	}
}
