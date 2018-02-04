import java.util.Scanner;


public class TestEmp {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee E1 = new Employee("U14314","Vinu","SE");
	/*	System.out.println("Details of E1");
		System.out.println("Emp ID :" + E1.getEmpId());
		System.out.println("Emp Name :" + E1.getEmpName());
		System.out.println("Emp Designation :" + E1.getEmpDesignation());
		System.out.println("Promoting E1...");
		E1.setEmpDesignation("System Analyst");
		System.out.println("New Details of E1");
		System.out.println("Emp ID :" + E1.getEmpId());
		System.out.println("Emp Name :" + E1.getEmpName());
		System.out.println("Emp Designation :" + E1.getEmpDesignation()); */
		
	/*  String s1 = "Vinu";
		System.out.println(s1);
		
		s1.concat(" Prabhakaran");
		
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Vinu");
		s2.append(" Prabhakaran");
		
		System.out.println(s2); */
		
	/*	System.out.println("Enter Score");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score < 35)
		{
			System.out.println("Failed");
		}
		else if (score < 55)
		{
			System.out.println("Second Class");
		}
		else if (score < 70)
		{
			System.out.println("First Class");
		}
		else
		{
			System.out.println("Distinction!!!");
		} */
		
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		while (num!= 0)
		{
				
			System.out.println("Please enter a number (0 to exit)");
			num = sc.nextInt();
			if (num ==0)
			{
			System.out.println("Exiting .. Bye");
			}
			else
			{
			System.out.println("2 times number is " + num*2);
			}
		}
		
		
			
	
	
	}

}
