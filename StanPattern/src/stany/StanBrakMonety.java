package stany;

import automat.AutomatSprzedajacy;

public class StanBrakMonety extends Stan {

	public StanBrakMonety(AutomatSprzedajacy automat) {
		super(automat);
	}

	public void wlozMonete() {
		System.out.println("Moneta przyjeta");
		zmienStan(new StanJestMoneta(automat));

	}


}
