package logon;

import encoders.PlainTextPasswordEncoder;

public class UnsecureLogon extends Logon {
	
	public UnsecureLogon() {
		setEncodingMethod(new PlainTextPasswordEncoder());
	}

}
