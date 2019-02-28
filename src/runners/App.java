package runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import beans.Coffee;
import beans.Tea;

public class App {

	private static List<Coffee> coffeeList = new ArrayList<>();
	private static List<Tea> teaList = new ArrayList<>();
	private static Scanner keyboard = new Scanner(System.in);

	static {
		coffeeList.add(new Coffee("fresh brewed coffee", "tall", 5, 1.75));
		coffeeList.add(new Coffee("fresh brewed coffee", "grande", 5, 2.10));
		coffeeList.add(new Coffee("fresh brewed coffee", "venti", 5, 2.35));

		coffeeList.add(new Coffee("iced coffee", "tall", 60, 2.25));
		coffeeList.add(new Coffee("iced coffee", "grande", 90, 2.65));
		coffeeList.add(new Coffee("iced coffee", "venti", 130, 2.95));

		coffeeList.add(new Coffee("cafe americano", "tall", 10, 2.25));
		coffeeList.add(new Coffee("cafe americano", "grande", 15, 2.65));
		coffeeList.add(new Coffee("cafe americano", "venti", 25, 2.95));

		coffeeList.add(new Coffee("flat white", "tall", 170, 3.75));

		coffeeList.add(new Coffee("caramel macciatto", "tall", 180, 3.65));
		coffeeList.add(new Coffee("caramel macciatto", "grande", 240, 4.25));
		coffeeList.add(new Coffee("caramel macciatto", "venti", 300, 4.65));

		teaList.add(new Tea("cinnamon chai latte", "tall", 5, 1.7));

	}

	public static void run() {

		System.out.println("=============WELCOME TO STARBUCKS==================");
		System.out.println("\n================OUR COFFEE MENU====================");
		System.out.println(coffeeList);

		double totalPrice = 0;
		int totalCalories = 0;
		double maxAllowed = 3;

		while (true) {
			if(totalPrice > maxAllowed) {
				System.out.println("you passed your daily max total allowed. Next time pay more attention!");
				keyboard.close();
				break;
			}
			System.out.println("\nPLEASE SELECT YOUR COFFEE");
			int selection = keyboard.nextInt();
			if (selection <= 0 || selection > coffeeList.size()) {
				System.out.println("Invalid selection. Please try another option.");
				continue;
			}
			Coffee product = coffeeList.get(selection - 1);
			totalPrice += product.getPrice();
			totalCalories += product.getCalories();
				System.out.println("total price is: " + totalPrice + "\ntotal calories are: " + totalCalories);
		}

	}
}

