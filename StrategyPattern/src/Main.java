
import encoders.MD5PasswordEncoder;
import encoders.SHA256PasswordEncoder;
import logon.Logon;
import logon.SecureMD5Logon;
import logon.UnsecureLogon;


public class Main {
	
	public static void main(String[] args) {
        Logon logon = new UnsecureLogon();
        //Logon logon = new SecureMD5Logon();
        logon.setPassword("t");
        System.out.println("Has³o po zakodowaniu: " + logon.getPassword());

        //zmiana metody kodowania w trakcie dzia³ania programu
        logon.setEncodingMethod(new MD5PasswordEncoder());
        //logon.setEncodingMethod(new SHA256PasswordEncoder());
        System.out.println("Has³o po zakodowaniu: " + logon.getPassword());
      }

}
