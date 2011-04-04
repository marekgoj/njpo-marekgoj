package polecenia;

import klasa.Swiatlo;

public class WylaczSwiatlo implements Polecenie {

private Swiatlo swiatlo;
	
	public WylaczSwiatlo(Swiatlo swiatlo){
		this.swiatlo = swiatlo;
	}
	
	@Override
	public void wykonaj() {
		swiatlo.wylacz();
	}

	@Override
	public void wycofaj() {
		swiatlo.wlacz();
	}

}
