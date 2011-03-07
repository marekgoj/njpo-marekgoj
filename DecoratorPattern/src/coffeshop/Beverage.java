package coffeshop;

public abstract class Beverage {
	protected String description = "Napoj nieznany";
	protected double cost;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double getCost();

}
