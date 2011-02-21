
import logon.Logon;
import logon.UnsecureLogon;


public class Main {
	
	public static void main (String[] args)
	{
		Logon logon = new UnsecureLogon();
		
		logon.setPassword("tajne123");
		
		
	}

}
