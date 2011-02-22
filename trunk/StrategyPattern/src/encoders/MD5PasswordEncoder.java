package encoders;

import java.math.BigInteger;
import java.security.*;

public class MD5PasswordEncoder implements IPasswordEncoder {

	@Override
	public String encode(String password) {
		// klasa MessageDigest return i kodowanie
		 		
		String answer = null;
		MessageDigest md5;
		
		try {
			md5 = MessageDigest.getInstance("MD5");
		    md5.update(password.getBytes(), 0, password.length());
		    answer = String.format("%1$032X", new BigInteger(1, md5.digest()));
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return answer;
	}

}
