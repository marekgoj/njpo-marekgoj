package klasa;

public class Swiatlo{
	private String stan;
	private int jasnosc;
	
	public void wlacz(){
		stan = "wlaczone";
		jasnosc = 100;
		System.out.println("> Wlaczam swiatlo");
	}
	
	public void wylacz(){
		stan = "wylaczone";
		System.out.println("> Wylaczam swiatlo");
	}
	
	public void ustawJasnosc(int jasnosc){
		this.jasnosc = jasnosc;
	}
	
	public void zwiekszJasnosc(){
		if (jasnosc >= 90)
			jasnosc = 100;
		else
			jasnosc += 10;
		System.out.println("> Zwiekszam jasnosc");
	}
	
	public void zmniejszJasnosc(){
		if (jasnosc <= 10)
			jasnosc = 0;
		else
			jasnosc -= 10;
		System.out.println("> Zmniejszam jasnosc");
	}
	
	public void pokazStan(){
		System.out.println(">>> Stan: " + stan + " | Jasnosc: " + jasnosc);
		System.out.println();
	}
}
