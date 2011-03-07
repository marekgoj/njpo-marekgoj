package coffeshop.beverages.coffe;

import coffeshop.Beverage;

public class PolishCoffe extends Beverage {
	public PolishCoffe() {
		description = "Fusiasta";
		cost = 2.0;
	}

	@Override
	public double getCost() {
		return  cost;
	}

}
