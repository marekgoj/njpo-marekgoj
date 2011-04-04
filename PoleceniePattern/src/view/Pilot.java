package view;
import java.util.Stack;

import polecenia.Polecenie;


public class Pilot {
	
	private Stack<Polecenie> stos = new Stack<Polecenie>();
	
	private Polecenie polecenieWłącz;
//	private Polecenie polecenieWyłącz;
//	private Polecenie polecenieZwiekszJasnosc;
//	private Polecenie polecenieZmniejszJasnosc;
	
	public void ustawPolecenie(Polecenie polecenie) {
		polecenieWłącz = polecenie;
	}
	
	public void przyciskWłączWciśnięty() {
		polecenieWłącz.wykonaj();
		stos.push(polecenieWłącz);
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
