package factory.method;

public class ChicagoStyleHawaiianPizza extends Pizza {
	public ChicagoStyleHawaiianPizza() {
		name = "Chicago Style Hawaiian Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Pineapple Chunks");
		toppings.add("Sliced Ham");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
