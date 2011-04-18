package stany;

import automat.AutomatSprzedajacy;

public abstract class Stan {
	protected AutomatSprzedajacy automat = null;
	
	public Stan(AutomatSprzedajacy automat){
		this.automat = automat;
	}
	
	public void wlozMonete(){
		System.out.println("*** Operacja nieobslugiwana! ***");
	};
	public void zwrocMonete(){
		System.out.println("*** Operacja nieobslugiwana! ***");
	};
	public void przekrecGalke(){
		System.out.println("*** Operacja nieobslugiwana! ***");
	};
	public void wydajGume(){
		System.out.println("*** Operacja nieobslugiwana! ***");
	};
	
	protected void zmienStan(Stan stan){
		automat.zmienStan(stan);
	}
	
}
