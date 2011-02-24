package logon;

import encoders.SHA256PasswordEncoder;

public class SecureSHA256Logon extends Logon {
	public SecureSHA256Logon(){
		setEncodingMethod(new SHA256PasswordEncoder()); 
	}

}
