package klasa;

public class Swiatlo{
	private String stan;
	private int jasnosc;
	
	public void wlacz(){
		stan = "wlaczone";
		jasnosc = 100;
	}
	
	public void wylacz(){
		stan = "wylaczone";
	}
	
	public void ustawJasnosc(int jasnosc){
		this.jasnosc = jasnosc;
	}
	
	public void zwiekszJasnosc(){
		if (jasnosc >= 90)
			jasnosc = 100;
		else
			jasnosc += 10;
	}
	
	public void zmniejszJasnosc(){
		if (jasnosc <= 10)
			jasnosc = 0;
		else
			jasnosc -= 10;
	}
	
	public void pokazStan(){
		System.out.println("> Stan: " + stan + " | Jasnosc: " + jasnosc);
	}
}
