package logon;

import encoders.IPasswordEncoder;

public abstract class Logon {
	
	private IPasswordEncoder passwordEncoder;
	
	private String password = null;
	
	public void setEncodingMethod(IPasswordEncoder passwordEncoder)
	{
		this.passwordEncoder = passwordEncoder;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return passwordEncoder.encode(password);
	}

}
