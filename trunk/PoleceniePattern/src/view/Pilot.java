package view;
import java.util.Stack;

import polecenia.Polecenie;


public class Pilot {
	
	private Stack<Polecenie> stos = new Stack<Polecenie>();
	
	private Polecenie polecenieW³¹cz;
//	private Polecenie polecenieWy³¹cz;
//	private Polecenie polecenieZwiekszJasnosc;
//	private Polecenie polecenieZmniejszJasnosc;
	
	public void ustawPolecenie(Polecenie polecenie) {
		polecenieW³¹cz = polecenie;
	}
	
	public void przyciskW³¹czWciœniêty() {
		polecenieW³¹cz.wykonaj();
		stos.push(polecenieW³¹cz);
	}
	
	public void przyciskWycofajPolecenieWcisniety(){
		if (stos.empty())
			System.out.println("Brak polecen do usuniecia");
		else{
			Polecenie polecenie = stos.pop();
			System.out.println("Wycofuje ostatnie polecenie: " + polecenie.toString() + " czyli:");
			polecenie.wycofaj();
		}
	}

	

}
