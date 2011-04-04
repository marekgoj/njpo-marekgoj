package view;
import polecenia.Polecenie;


public class Pilot {
	private Polecenie polecenieW³¹cz;
//	private Polecenie polecenieWy³¹cz;
//	private Polecenie polecenieZwiekszJasnosc;
//	private Polecenie polecenieZmniejszJasnosc;
	
	public void ustawPolecenie(Polecenie polecenie) {
		polecenieW³¹cz = polecenie;
	}
	
	public void przyciskW³¹czWciœniêty() {
		polecenieW³¹cz.wykonaj();
	}

	

}
