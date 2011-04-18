package automat;

import stany.*;

public class AutomatSprzedajacy {
	private Stan stan = null;
	private int liczbaGum = 0;
//	private Stan stanJestMoneta = new StanJestMoneta(this);
//	private Stan stanBrakMonety = new StanBrakMonety(this);
//	private Stan stanGumaSprzedana = new StanGumaSprzedana(this);
//	private Stan stanBrakGum = new StanBrakGum(this);


	public AutomatSprzedajacy(int liczbaGum){
		if (liczbaGum > 0){
			this.liczbaGum = liczbaGum;
			this.stan = new StanBrakMonety(this);
		}
	}
	
	@Override
	public String toString(){
		return ">>> " + stan.getClass().getSimpleName() + " " + liczbaGum;
	}
	public int getLiczbaGum() {
		return liczbaGum;
	}

	public void setLiczbaGum(int liczbaGum) {
		this.liczbaGum = liczbaGum;
	}
	
	public void wlozMonete(){
		stan.wlozMonete();
	}
	
	public void zwrocMonete(){
		stan.zwrocMonete();
	}
	
	public void przekrecGalke(){
		stan.przekrecGalke();
		stan.wydajGume();
	}
	
	public void wydajGume(){
	}

	public void zmienStan(Stan s) {
		this.stan = s;
	}
	
}
