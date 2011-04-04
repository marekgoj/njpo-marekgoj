package polecenia;

import klasa.Swiatlo;

public class ZwiekszJasnosc implements Polecenie {

private Swiatlo swiatlo;
	
	public ZwiekszJasnosc(Swiatlo swiatlo){
		this.swiatlo = swiatlo;
	}
	
	@Override
	public void wykonaj() {
		swiatlo.zwiekszJasnosc();
	}

	@Override
	public void wycofaj() {
		swiatlo.zmniejszJasnosc();

	}

}
