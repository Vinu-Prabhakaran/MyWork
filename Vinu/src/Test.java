
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

class Test
{
	public static boolean heatwave=true;
	public static void main(String args[])
	{
		
		//boolean heatwave=false;
		
		System.out.println(heatwave);
		Arrays.sort(args);
		System.out.println(Arrays.toString(args));
		
		System.out.println("This is my sample Java code");
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd yyyy ~~ hh:mm:ss");
		System.out.println(LocalDateTime.now().format(f1));
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		LocalDate date1 = LocalDate.parse("January 28 2018",f2);
		System.out.println(date1);
		
		Period p = Period.of(1, 1, 10);
		System.out.println(date1.minusDays(10).plus(p));
		
		List<String> exams = Arrays.asList("OCA", "OCP");
		for (String e1 : exams)
		for (String e2 : exams)
		System.out.println(e1 + " " + e2);
	
		
	}
}