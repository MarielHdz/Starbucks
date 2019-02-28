package beans;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a subclass of Drink class.
 * It will be used to store coffee menu from Starbucks
 * @author paoh4
 *
 */
public class Coffee extends Drink{

	
	private String flavor;
	private static List<String> options;
	
	/**
	 * static block runs once when class loads (CLASS LOADER)
	 * adds options of the coffee menu
	 * 
	 */
	static {
		options = new ArrayList<>();
		options.add("fresh brewed coffee");
		options.add("iced coffee");
		options.add("cafe americano");
		options.add("flat white");
		options.add("cafe latte");
		options.add("caramel macciatto");
		options.add("white chocolate mocha");
		options.add("cafe mocha");		
	}
	
	/**
	 * Calls super constructor of Drink class and assign values
	 * @param name
	 * @param size
	 * @param calories
	 * @param price
	 */
	
	public Coffee(String name, String size, int calories, double price) {
		super(name, size, calories, price);
		// TODO Auto-generated constructor stub
	}

	/**
	 * overrides setName to only add items from coffee menu
	 */
	@Override
	public void setName(String name) {
		if(options.contains(name)) {
			super.setName(name);
		}else {
			System.out.println("CoffeeNameNotFoundException: " + name);
		}
	}

	@Override
	public String toString() {
		return "\nCoffee [Name=" + getName() + ", Size=" + getSize() + ", Calories="
				+ getCalories() + ", Price=" + getPrice() + "]";
	}
	
	
	
}
