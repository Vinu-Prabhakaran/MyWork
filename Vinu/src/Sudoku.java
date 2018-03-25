import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sudoku {
	
	static int[][] game;
	
	static String shoe1 = new String("sandal");
	static String shoe2 = new String("flip flop");
	
	public static void shopping() {
	String shoe3 = new String("croc");
	shoe2 = shoe1;
	shoe1 = shoe3;
	}
	
	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(game));
		//game[3][3] = 6;
//		Object[] obj = game;
//		obj[3] = 'X';
//		System.out.println(game[3][3]);
		
		int count = 0;
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);
		while (date.getMonth() != Month.APRIL)
		date = date.minusMonths(1);
		count++;
		System.out.println(count);
		
		final short sh=1;
		final byte by=2;
		
		short var = 10;
		switch(var) {
			case(sh):
				System.out.println("Short");
			case(by):
				System.out.println("Byte");
			default:
				System.out.println("Default");
			
		}
		
		List l1 = new ArrayList();
		List l2 = new ArrayList<>();
		//List<> l3 = new ArrayList();
		//List<> l4 = new ArrayList<>();
		List<String> l5 = new ArrayList();
		List<String> l6 = new ArrayList<>();
		List<String> l7 = new ArrayList<String>();
		//List<> l8 = new ArrayList<String>();
		
		
		
	 }
}
