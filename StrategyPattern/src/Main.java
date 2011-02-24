
import encoders.MD5PasswordEncoder;
import encoders.SHA256PasswordEncoder;
import encoders.SHA512PasswordEncoder;
import logon.Logon;
import logon.SecureMD5Logon;
import logon.UnsecureLogon;


public class Main {
	
	public static void main(String[] args) {
        Logon logon = new UnsecureLogon();
        //Logon logon = new SecureMD5Logon();
        logon.setPassword("tekst123");
        System.out.println("Has這 po zakodowaniu: " + logon.getPassword());

        //zmiana metody kodowania w trakcie dzia豉nia programu
        logon.setEncodingMethod(new MD5PasswordEncoder());
        System.out.println("Has這 po zakodowaniu: " + logon.getPassword());
        logon.setEncodingMethod(new SHA256PasswordEncoder());
        System.out.println("Has這 po zakodowaniu: " + logon.getPassword());
        logon.setEncodingMethod(new SHA512PasswordEncoder());
        System.out.println("Has這 po zakodowaniu: " + logon.getPassword());
        
      }

}
