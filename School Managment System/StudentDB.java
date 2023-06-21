import java.sql.*;
import java.util.ArrayList;
public class StudentDB {
	private static String[] StData = new String[8];
	public static ArrayList<String> data = new ArrayList<String>();
	
	static public void main(String args[]) {
//		ArrayList<String> sample =  StudentDB.studentMarkView(3);
//		boolean result = sample.size()==5;
//		if(result)
//			System.out.println("success");
//		else {
//			System.out.println("Something is wrong");
//		}
	}
	public static boolean valid(int StudentId,String pwd) {
		boolean status = false;
		try {
			Connection conn = DB.getConnection();
			String query = "SELECT sid,sname,spassword FROM student where sid=(?) AND spassword=(?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,StudentId);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		}catch(Exception e) { System.out.println(e); }
		return status;
	}

//	public static boolean studentDetailStatus(int Sid) {
//		boolean status = false;
//		try {
//			Connection con = DB.getConnection();
//			String query = "SELECT sname,class,gender,addrs,city,email,contact from student where sid=(?) ;";
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setInt(1, Sid);
//			ResultSet rs = ps.executeQuery();
//			status = rs.next();
//			if(status) {
//				for(int i=1;i<8;i++) {
//					StData[i-1] = rs.getString(i);
//				}
//			}
//			con.close();
//		}catch(Exception e) { System.out.println(e); }
//		return status;
//	} 
	
	public static ArrayList<String> studentDetail(int Sid) {
		ArrayList<String> StData = new ArrayList<String>(); 
		boolean status = false;
		try {
			Connection con = DB.getConnection();
			String query = "SELECT sname,class,gender,addrs,city,email,contact from student where sid=(?) ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, Sid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				for(int i=1;i<=7;i++) {
					StData.add(rs.getString(i));
				}
			}
			con.close();
		}catch(Exception e) { System.out.println(e); }
		return StData ;
	} 
	
	public static ArrayList<String> studentMarkView(int Sid) {
		ArrayList<String> Data = new ArrayList<String>();
		boolean status = false;
		try {
			Connection con = DB.getConnection();
			String query="SELECT * FROM studentMarks where SID =(?);";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, Sid);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			if(status) {
				for(int i=2;i<=7;i++) {
					Data.add(rs.getString(i));
				}
			}
			con.close();
		}catch(Exception e) { System.out.println(e); }
		
		return Data;
	}
	
//	String query="insert into makeResult(sid,slanguage,english,socialscience,mathematics,science,tid) values(?,?,?,?,?,?,?)";

//	public static boolean StDetail(String name,String password){
//		boolean status=false;
//		try{
//			Connection con=DB.getConnection();
//			PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
//			ps.setString(1,name);
//			ps.setString(2,password);
//			ResultSet rs=ps.executeQuery();
//			status=rs.next();
//			con.close();
//		}catch(Exception e){System.out.println(e);}
//		return status;
//	}
}
