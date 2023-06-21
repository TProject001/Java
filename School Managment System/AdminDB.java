import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminDB { 
	 //custom variable
	static ArrayList<String> data = new ArrayList<String>();
	
	public static void clearTeacherDetails(JTable table) {
		table.setModel(new DefaultTableModel());
	}
	
	public static void viewTeacherDetails(JTable table) {  //JTable table
		try {
			Connection conn = DB.getConnection();
			String query = "select * from teacher;";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
					
			//Add Column
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			//Add column
			int cols = rsmd.getColumnCount();
				System.out.println("Colmn : "+cols);
			String[] colName = new String[cols];
			for(int i=0;i<cols;i++) {
				colName[i] = rsmd.getColumnName(i+1);
			}
			model.setColumnIdentifiers(colName);
			//Add Rows
			String[] SDatas = new String[11]; 
			while(rs.next()) { 
				for(int i=1;i<=11;i++) {
					SDatas[i-1] = rs.getString(i);
					}
					model.addRow(SDatas);
				}
//					String[] ColName = {"sid","sname","class","gender","addrs","city","email","contact"};
					//add column to table
//			//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//					model.setColumnIdentifiers(ColName);
//					//Add Rows
//					String[] SDatas = new String[8]; 
//					while(rs.next()) {
//						SDatas[0] = rs.getInt(1) + ""; 
//						for(int i=2;i<=8;i++) {
//							SDatas[i-1] = rs.getString(i);
//						}
//						model.addRow(SDatas);
//					}
			}catch(Exception e) { System.out.println(e); }
		} 
	
	public static int addTeacher(String[] str) {
		int status=0;
		int salary = Integer.parseInt(str[3]);
		String query="INSERT INTO teacher(tname,gender,dept,salary,addrs,city,email,contact,tpassword) VALUES(?,?,?,?,?,?,?,?,?)";//sha2('123',256)
		try {
			Connection conn = DB.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, str[0]);
			ps.setString(2, str[1]);
			ps.setString(3, str[2]);
			ps.setInt(4, salary);
			ps.setString(5, str[4]);
			ps.setString(6, str[5]);
			ps.setString(7, str[6]);
			ps.setString(8, str[7]);
			ps.setString(9, AdminDB.hash256(str[8]));
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e) {System.out.println(e);}
		return status;
	}
	
	public static boolean TeacherExist(int tid) {
		try {
			Connection conn = DB.getConnection();
			String query = "Select * from teacher where tid = (?);";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, tid);
			ResultSet rs = ps.executeQuery();
			return rs.next();
//			return ps.executeUpdate();
		}catch(Exception e) { System.out.println(e); }
		return false ;
	}
//	public static boolean validatedStudentId(int sid) {
//		Connection conn = DB.getConnection();
//		// check if student and teacher is present in database or not
//		try {
//		String query = "SELECT * FROM student where sid=(?)";
//		PreparedStatement ps1 =conn.prepareStatement(query);
//		ps1.setInt(1, sid);
//		ResultSet rs = ps1.executeQuery();
//		return rs.next();
//		}catch(Exception e) { System.out.println(e); }
//		return false;
//	}
	
	public static ArrayList<String> getTeacherDetail(int tid) {
		ArrayList<String> tData = new ArrayList<String>();
		String query = "Select * from teacher where tid=(?)";
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, tid);
			ResultSet rs = ps.executeQuery();
		//	status = rs.next();
			if(rs.next()) {  //status
				for(int i=1;i<=8;i++) {
					tData.add(rs.getString(i));
				}
			}
		}catch(Exception e) { System.out.println(e); }
		return tData;
	}
	public static int updateTeacherDetail(int tid) {
		data = AdminDB.getTeacherDetail(tid) ;
		int status = 0;
		try {
			Connection con = DB.getConnection();
			String query = "update teacher set tname=(?) gender=(?),dept=(?),salary=(?),addrs=(?),city=(?),email=(?),contact=(?) where tid = (?); ";
			PreparedStatement ps = con.prepareStatement(query);
//			for(int i=1;i<=8;i++) {
//				ps.setString(i,data.get(i-1));
////				System.out.println(data[i-1]);
//			}
			ps.setString(1,data.get(1)); //name
			ps.setString(2,data.get(3)); //dept
			ps.setString(3,data.get(2)); //gender
			ps.setString(4,data.get(5)); //address
			ps.setString(5,data.get(6)); //city
			ps.setString(6,data.get(7)); //email
			ps.setString(7,data.get(8)); //contact
			ps.setString(8,data.get(4)); //salary
			ps.setInt(9, tid);
			status = ps.executeUpdate();
		//	status = rs.next();
			con.close();
		//	System.out.println("Updated successfully !");
		}catch(Exception e) { System.out.println(e); }
		return status;
	} 
	
	public static int deleteTeacher(int tid) {
		if(AdminDB.TeacherExist(tid)) {
			try {
				Connection conn = DB.getConnection();
				String query = "Delete from teacher where tid = (?)";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setInt(1, tid);
				return ps.executeUpdate();
			}catch(Exception e) { System.out.println(e);}
		}
		else {
			System.out.println("Teacher not exist");
		}
		return 0;
	}
	
	private static String hash256(String pwd) {
		MessageDigest md;
		StringBuffer hexString = new StringBuffer();
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(pwd.getBytes());
			byte[] digest = md.digest();
			for(int  i=0;i<digest.length ; i++) {
				hexString.append(Integer.toHexString(0xFF & digest[i]));
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hexString.toString() ;
	}
}
