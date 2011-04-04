package view;
import java.util.Stack;

import polecenia.Polecenie;


public class Pilot {
	
	private Stack<Polecenie> stos = new Stack<Polecenie>();
	
	private Polecenie polecenieW��cz;
//	private Polecenie polecenieWy��cz;
//	private Polecenie polecenieZwiekszJasnosc;
//	private Polecenie polecenieZmniejszJasnosc;
	
	public void ustawPolecenie(Polecenie polecenie) {
		polecenieW��cz = polecenie;
	}
	
	public void przyciskW��czWci�ni�ty() {
		polecenieW��cz.wykonaj();
		stos.push(polecenieW��cz);
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
