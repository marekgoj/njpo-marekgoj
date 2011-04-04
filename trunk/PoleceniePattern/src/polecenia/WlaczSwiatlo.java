package polecenia;

import klasa.Swiatlo;

public class WlaczSwiatlo implements Polecenie {
	private Swiatlo swiatlo;
	
	public WlaczSwiatlo(Swiatlo swiatlo){
		this.swiatlo = swiatlo;
	}
	
	@Override
	public void wykonaj() {
		swiatlo.wlacz();
	}

	@Override
	public void wycofaj() {
		swiatlo.wylacz();

	}

}
