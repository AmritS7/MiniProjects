package factory.method;

public class NYStyleHawaiianPizza extends Pizza{
	public NYStyleHawaiianPizza() {
		name = "NY Style Hawaiian Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Pineapple Chunks");
		toppings.add("Sliced Ham");
}

}
