import automat.AutomatSprzedajacy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AutomatSprzedajacy automat = new AutomatSprzedajacy(3);
	    
	    automat.wlozMonete();
	      System.out.println(automat);
	    automat.przekrecGalke();
	      System.out.println(automat);

	    automat.wlozMonete();
	      System.out.println(automat);
	    automat.zwrocMonete();
	      System.out.println(automat);
	    automat.przekrecGalke();
	      System.out.println(automat);
	    automat.przekrecGalke();
	      System.out.println(automat);
	      
	    automat.wlozMonete();
	    automat.przekrecGalke();
	      System.out.println(automat);
	    automat.wlozMonete();
	    automat.przekrecGalke();
	      System.out.println(automat);
	    automat.wlozMonete();
	    automat.przekrecGalke();
	      System.out.println(automat);
	    automat.wlozMonete();
	    automat.przekrecGalke(); 

	}

}
