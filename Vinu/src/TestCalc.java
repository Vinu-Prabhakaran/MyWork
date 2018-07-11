import java.util.Scanner;


public class TestCalc {
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first digit...");
		double var1 = sc.nextDouble();
		System.out.println("Please enter Second digit...");
		double var2 = sc.nextDouble();
		
		Calculator C1 = new Calculator(var1,var2);
		
		System.out.println("Addition Result - " + C1.add(var1, var2));
		System.out.println("Subtraction Result - " + C1.subtract(var1, var2));
		System.out.println("Multiplication Result - " + C1.multiply(var1, var2));
		System.out.println("Division Result - " + C1.divide(var1, var2));

	}
}
