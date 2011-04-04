package polecenia;

import klasa.Swiatlo;

public class ZmniejszJasnosc implements Polecenie {

private Swiatlo swiatlo;
	
	public ZmniejszJasnosc(Swiatlo swiatlo){
		this.swiatlo = swiatlo;
	}
	
	@Override
	public void wykonaj() {
		swiatlo.zmniejszJasnosc();
	}

	@Override
	public void wycofaj() {
		swiatlo.zwiekszJasnosc();

	}

}
