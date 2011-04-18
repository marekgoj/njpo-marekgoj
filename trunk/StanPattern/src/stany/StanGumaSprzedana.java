package stany;

import automat.AutomatSprzedajacy;

public class StanGumaSprzedana extends Stan {

	public StanGumaSprzedana(AutomatSprzedajacy automat) {
		super(automat);
	}
	
	public void wydajGume(){
		automat.setLiczbaGum(automat.getLiczbaGum() - 1);
		if (automat.getLiczbaGum() > 0){
			zmienStan(new StanBrakMonety(automat));
		}
		else {
			System.out.println("Brak gum");
			zmienStan(new StanBrakGum(automat));
		}
		
	}
}
