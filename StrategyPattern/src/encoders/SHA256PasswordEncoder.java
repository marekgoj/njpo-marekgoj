package encoders;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256PasswordEncoder implements IPasswordEncoder {

	@Override
	public String encode(String password) {
		String answer = null;
		MessageDigest sha256;
		
		try {
			sha256 = MessageDigest.getInstance("SHA-256");
		    sha256.update(password.getBytes(), 0, password.length());
		    //kod dodany
		    byte[] tab = sha256.digest();
		    
		    answer = String.format("%1$064X", new BigInteger(1, tab)); //chyba nie trzeba 032
		    
		    //kod dodany
		    //wyswietlanie 
		    for(byte b : tab){
		    	System.out.print(b + " ");
		    }
		    System.out.println();
		    for(byte b : tab){
		    	String Sbyte = String.format("%1$02X", Integer.valueOf(b));
		    	System.out.print(Sbyte.substring(Sbyte.length()-2, Sbyte.length()) + " ");
		    }
		    
		    System.out.println();
		    /*
		    System.out.println("md5.getProvider().getInfo(): " + md5.getProvider().getInfo());
		    System.out.println("md5.getProvider().getInfo(): " + md5.getProvider().getServices());
		    /* Diagnostyka
		    System.out.println();
		    System.out.println("md5.digest().toString(): " + tab.toString());
		    System.out.println("md5.getAlgorithm(): " + md5.getAlgorithm());
		    System.out.println("md5.getDigestLength(): " + md5.getDigestLength());
		    System.out.println("md5.getProvider().toString(): " + md5.getProvider().toString());
		    System.out.println("new BigInteger(1, md5.digest()).toString(): " + new BigInteger(1, tab).toString());
		    */
		   			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "(SHA256)" + answer;
	}

}