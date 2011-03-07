package coffeshop.condiments;

import coffeshop.Beverage;
import coffeshop.CondimentDecorator;

public class Milk extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.description = "mleko";
		this.cost = 0.33;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + " + description;
	}

	@Override
	public double getCost() {
		return beverage.getCost() + cost;
	}

}
