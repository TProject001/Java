import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurePassword {
	
	public static String hash256(String pwd) {
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
