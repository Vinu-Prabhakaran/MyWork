/**
 * 
 */
package com.vinu.ocpchap3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Vinu Prabhakaran
 *         on Jul 12, 2021
 *
 */
class Squirrel{
	
	private int weight;
	private String species;
	public Squirrel(String theSpecies) {
	if (theSpecies == null) throw new IllegalArgumentException();
	species = theSpecies;
	}
	public int getWeight() { return weight; }
	public void setWeight(int weight) { this.weight = weight; }
	public String getSpecies() { return species; 
	
	}
	@Override
	public String toString() {
		return "Squirrel [weight=" + weight + ", species=" + species + "]";
	}
}
class MultiFieldComparator implements Comparator<Squirrel>{

	@Override
	public int compare(Squirrel o1, Squirrel o2) {
		int speciesCompare = o1.getSpecies().compareTo(o2.getSpecies());
		if (speciesCompare !=0) {
			return speciesCompare;
		}
		return o1.getWeight() - o2.getWeight();
	}
	
}

class ChainingComparator implements Comparator<Squirrel>{

	@Override
	public int compare(Squirrel o1, Squirrel o2) {
		Comparator<Squirrel> c=Comparator.comparing(s -> s.getSpecies());
		c=c.thenComparingInt(s -> s.getWeight());
		return c.compare(o1, o2);
	}
	
}
public class MultiFieldComparatorTest {
	
	 public static void main(String[] args) {
		
		 Squirrel s1=new Squirrel("S1");
		 s1.setWeight(10);
		 Squirrel s2=new Squirrel("S2");
		 s2.setWeight(8);
		 Squirrel s3=new Squirrel("S3");
		 s3.setWeight(12);
		 
		 List<Squirrel> sList=Arrays.asList(s1,s2,s3);
		 
		 sList.stream().sorted(Comparator.comparing(s -> s.getSpecies())).collect(Collectors.toList()).forEach(System.out::println);
		 Collections.sort(sList, (sq1,sq2) -> sq1.getWeight() - sq2.getWeight());
		 System.out.println("Sorted by Weight :"+sList);
		 System.out.println(Collections.binarySearch(sList, s2, (sq1,sq2) -> sq1.getWeight() - sq2.getWeight()));
	}

}
