package coffeshop.condiments;

import coffeshop.Beverage;
import coffeshop.CondimentDecorator;

public class WhippedCream extends CondimentDecorator {

	private Beverage beverage;

	public WhippedCream(Beverage beverage) {
		this.beverage = beverage;
		this.description = "œmietanka";
		this.cost = 0.50;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + " + description;
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 0.90;
	}

}
