package view;
import polecenia.Polecenie;


public class Pilot {
	private Polecenie polecenieW��cz;
//	private Polecenie polecenieWy��cz;
//	private Polecenie polecenieZwiekszJasnosc;
//	private Polecenie polecenieZmniejszJasnosc;
	
	public void ustawPolecenie(Polecenie polecenie) {
		polecenieW��cz = polecenie;
	}
	
	public void przyciskW��czWci�ni�ty() {
		polecenieW��cz.wykonaj();
	}

	

}
