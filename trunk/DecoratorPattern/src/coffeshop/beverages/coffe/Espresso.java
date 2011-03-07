package coffeshop.beverages.coffe;

import coffeshop.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
		cost = 3.50;
	}

	@Override
	public double getCost() {
		return cost;
	}

}
