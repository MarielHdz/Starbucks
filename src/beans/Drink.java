package beans;

import java.util.Arrays;

/**
 * Drink Object
 * 
 * A <code>Drink</code> Object contains parameters and functionality of
 * that can be use by any Drink subclass.
 * 
 * @author paoh4
 * @version 1.0 Jan 25, 2019
 */

public class Drink {

	private String name;
	private String size;
	private int calories;
	private double price;

/**
 * Constructor accepts parameters and assign to variables
 * 
 * @param name - drink name
 * @param size - drink size
 * @param calories - calories in the drink
 * @param price = the price of the drink
 * 
 */
	public Drink(String name, String size, int calories, double price) {
		super();
		setName(name);
		setSize(size);
		this.calories = calories;
		this.price = price;
	}

	/**
	 * getter method for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * getter method for size
	 * @return size
	 */
	public String getSize() {
		return size;
	}

	public int getCalories() {
		return calories;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * to String method
	 * 
	 * @return a String containing name, size, calories and price of a selected drink.
	 */
	@Override
	public String toString() {
		return "Drink [name=" + name + ", size=" + size + ", calories=" + calories + ", price=" + price
				+ "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(String size) {
		if(size.equals("tall") || size.equals("grande") || size.equals("venti") ) {
			this.size = size;
		}else {
			System.out.println("InvalidSizeException: " + size);
		}
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
