import coffeshop.Beverage;
import coffeshop.beverages.coffe.Espresso;
import coffeshop.beverages.coffe.PolishCoffe;
import coffeshop.condiments.Sugar;
import coffeshop.condiments.WhippedCream;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Beverage c1 = new Espresso();
		showSummary(c1);
		
		Beverage c2 = new PolishCoffe();
		c2 = new Sugar(c2);
		showSummary(c2);
		
		Beverage c3 = new Espresso();
		c3 = new WhippedCream(c3);
		c3 = new WhippedCream(c3);
		c3 = new Sugar(c3);
		c3 = new Sugar(c3);
		c3 = new Sugar(c3);
		showSummary(c3);


	}

	/**
	 * Wyœwietla opis i koszt wybranego napoju
	 * 
	 * @param b - obiekt napoju
	 */
	private static void showSummary(Beverage b) {
		System.out.println("Opis: " + b.getDescription());
		System.out.println("Cena: " + String.format("%.2f", b.getCost())
				+ " z³");
		System.out.println("---------------------------");
	}
}
