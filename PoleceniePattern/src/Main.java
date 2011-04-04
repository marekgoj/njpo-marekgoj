import polecenia.WlaczSwiatlo;
import polecenia.WylaczSwiatlo;
import polecenia.ZmniejszJasnosc;
import polecenia.ZwiekszJasnosc;
import klasa.Swiatlo;
import view.Pilot;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pilot pilot = new Pilot();
		Swiatlo swiatlo1 = new Swiatlo();
		WlaczSwiatlo wlaczSwiatlo = new WlaczSwiatlo(swiatlo1);
		WylaczSwiatlo wylaczSwiatlo = new WylaczSwiatlo(swiatlo1);
		ZwiekszJasnosc zwiekszJasnosc = new ZwiekszJasnosc(swiatlo1);
		ZmniejszJasnosc zmniejszJasnosc = new ZmniejszJasnosc(swiatlo1);
		
		pilot.ustawPolecenie(wlaczSwiatlo);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.ustawPolecenie(wylaczSwiatlo);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.ustawPolecenie(wlaczSwiatlo);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.ustawPolecenie(zmniejszJasnosc);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.ustawPolecenie(zmniejszJasnosc);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.ustawPolecenie(zwiekszJasnosc);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.ustawPolecenie(zmniejszJasnosc);
		pilot.przyciskW³¹czWciœniêty();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
		
		pilot.przyciskWycofajPolecenieWcisniety();
		swiatlo1.pokazStan();
	}

}
