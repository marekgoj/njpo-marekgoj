package view;
import polecenia.Polecenie;


public class Pilot {
	private Polecenie polecenieWłącz;
//	private Polecenie polecenieWyłącz;
//	private Polecenie polecenieZwiekszJasnosc;
//	private Polecenie polecenieZmniejszJasnosc;
	
	public void ustawPolecenie(Polecenie polecenie) {
		polecenieWłącz = polecenie;
	}
	
	public void przyciskWłączWciśnięty() {
		polecenieWłącz.wykonaj();
	}

	

}
