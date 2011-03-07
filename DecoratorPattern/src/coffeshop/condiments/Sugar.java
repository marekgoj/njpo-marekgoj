package coffeshop.condiments;

import coffeshop.Beverage;
import coffeshop.CondimentDecorator;

public class Sugar extends CondimentDecorator {
	
	private Beverage beverage;

	public Sugar(Beverage beverage) {
		this.beverage = beverage;
		this.description = "cukier";
		this.cost = 0.14;
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
