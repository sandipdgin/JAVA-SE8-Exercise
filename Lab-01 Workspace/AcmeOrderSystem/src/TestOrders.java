
public class TestOrders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1,20,2008);
		Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

		MyDate date2 = new MyDate(4,10,2008);
		Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);

		System.out.println(anvil);
		System.out.println(balloons);
		
		
		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		
		Order.setTaxRate(0.06);
		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		
		//bonus lab
		MyDate date3 = new MyDate(5, 20, 2008);
		Order anotherAnvil = new Order(date3, 200, "Road Runner");
		System.out.println(anotherAnvil);

	}

}

/*console output-
10 ea. Anvil for Wile E Coyote
125 ea. Balloon for Bugs Bunny
The tax Rate is currently: 0.05
The tax for 3000.0 is: 150.0
The tax for this order is: 100.0
The tax for this order is: 50.0
The tax Rate is currently: 0.06
The tax for 3000.0 is: 180.0
The tax for this order is: 120.0
The tax for this order is: 60.0
*/