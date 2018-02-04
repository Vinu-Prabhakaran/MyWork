import java.util.Scanner;


public class Tester 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Car c1 = new Car("Accord",10000);
		Car c2 = new Car("Civic",8000);
		Car c3 = new Car();
		
		String carModel;
		double carPrice;
		double priceInc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the car model...");
		carModel = sc.nextLine();
		
		System.out.println("Please enter the car price...");
		carPrice = sc.nextDouble();
		
		Car c1 = new Car(carModel,carPrice);
		
		System.out.println("Car1 Details");
		System.out.println(c1.getModel());
		System.out.println(c1.getPrice());
		System.out.println("Car2 Details");
		System.out.println(c2.getModel());
		System.out.println(c2.getPrice());
		
		System.out.println("Car3 Details");
		System.out.println(c3.getModel());
		System.out.println(c3.getPrice());
		
		System.out.println("Updating Price of Car1...");
		c1.setPrice(12000);
		System.out.println("Updated Price is " + c1.getPrice());
		
		System.out.println("Please provide the price increment rate in Percentage");
		priceInc = sc.nextDouble();
		
		System.out.println("Invoking Price increment by " + priceInc +  "% for Car1...");
		c1.incrementPriceByPercent(priceInc);
		System.out.println("Incremented Price is " + c1.getPrice());
		
	}

}
