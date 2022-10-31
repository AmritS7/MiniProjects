package simple.factory;

public class HawaiianPizza extends Pizza{
	public HawaiianPizza(){
		name = "Hawaiian Pizza";
		dough = "Regular Crust";
		sauce = "Marinara sauce";
		toppings.add("Shredded mozzarella cheese");
		toppings.add("Pineapple Chunks");
		toppings.add("Sliced Ham");
	}
}
