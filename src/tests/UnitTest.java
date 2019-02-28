package tests;

import org.junit.Test;

import beans.Coffee;
import beans.Tea;
import runners.App;

public class UnitTest {

	@Test
	public void coffeeTest() {
		Coffee c = new Coffee("fresh brewed coffee", "tall", 5, 1.75);
		System.out.println(c.toString());
		
		
		Coffee c2 = new Coffee("unexistent coffee name", "tall", 5, 1.75);
		System.out.println(c.toString());
		
//		App ap = new App();
//		ap.run();
	}
	
	@Test
	public void teaTest() {
		Tea c = new Tea("cinnamon chai latte", "unexistentSize", 5, 1.75);
		System.out.println(c.toString());
		
		Tea c2 = new Tea("unexistent tea name", "tall", 5, 1.75);
		System.out.println(c.toString());		
	}
}
