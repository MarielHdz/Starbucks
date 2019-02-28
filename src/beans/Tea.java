package beans;

import java.util.ArrayList;
import java.util.List;

public class Tea extends Drink{

	private String flavor;
	private static List<String> options;
	
	static {
		options = new ArrayList<>();
		options.add("cinnamon chai latte");
		options.add("classic chai tea latte");
		options.add("peach green tea lemonade");
		options.add("shaken iced tea");
		options.add("very berry hibiscus");
	}
	
	public Tea(String name, String size, int calories, double price) {
		super(name, size, calories, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setName(String name) {
		if(options.contains(name)) {
			super.setName(name);
		}else {
			System.out.println("TeaNameNotFoundException: " + name);
		}
	}

	@Override
	public String toString() {
		return "Tea [Name=" + getName() + ", Size=" + getSize() + ", Calories="
				+ getCalories() + ", Price=" + getPrice() + "]";
	}
	
	
}
