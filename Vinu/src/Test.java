
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


class Test
{
	public static boolean heatwave=true;
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-"); // sb = animals-
		sb.insert(0, "-"); // sb = -animals-
		sb.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb);
		
		//StringBuilder sb1 = new StringBuilder("animals").insert(sb1.length(), " in the zoo");
		
		String name ="something";
		String name1="something".trim();
		System.out.println(name.substring(0,name.length()));
		System.out.println(name==name1);
		
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs == alias); //
		
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
		
		List<String> names = new ArrayList<>();
		names.add(0,"Java");
		System.out.println(names.set(0, "CPP"));
		names.add("C");
		String[] namesArr = names.toArray(new String[0]);
		System.out.println(Arrays.toString(namesArr));
		namesArr[0]="Java";
		System.out.println(Arrays.toString(namesArr));
		System.out.println(names);
		names.add("Vinu");
		System.out.println(names);
		System.out.println(Arrays.toString(namesArr));
			
		
		Double d = new Double(1);
		Float f = new Float(1.0f);
		Long l = new Long(1);
		
		Random r = new Random();
		System.out.println(r.nextInt(100));
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date);
	
		
	}
}