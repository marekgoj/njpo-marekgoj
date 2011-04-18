package stany;

import automat.AutomatSprzedajacy;

public class StanJestMoneta extends Stan {

	public StanJestMoneta(AutomatSprzedajacy automat) {
		super(automat);
	}
	
	@Override
	public void zwrocMonete(){
		System.out.println("Zwracam monete");
		zmienStan(new StanBrakMonety(automat));
	}
	
	@Override
	public void przekrecGalke(){
		System.out.println("Wydawanie gumy");
		zmienStan(new StanGumaSprzedana(automat));
	}

}
