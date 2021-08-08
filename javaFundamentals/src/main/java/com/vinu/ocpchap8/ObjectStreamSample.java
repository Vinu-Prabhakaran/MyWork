/**
 * 
 */
package com.vinu.ocpchap8;

import java.io.*;
import java.util.*;

import lombok.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 6, 2021
 *
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
class Person implements Serializable{
	

	private static final long serialVersionUID = 1208290153250400650L;
	private String firstName;
	private String lastName;
	private Integer age;
	private transient String citizenship; //Skipped in serialization
	{
		this.citizenship = "Indian";
	}
}
public class ObjectStreamSample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		List<Person> people= Arrays.asList(new Person("Vinu", "Prabhakaran", 37,"Indian"),
											new Person("Ameya", "Vinu", 9,"Indian"),
											new Person("Aditi","Vinu",4,"Indian"));
		File f1=new File("src/main/resources/IO/People.data");
		writeObjectsToFile(people,f1);
		System.out.println(readObjectsFromFile(f1));
		
	}
	
	private static void writeObjectsToFile(List<Person> people,File f1) throws IOException{
		
		try(ObjectOutputStream objOut=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f1)))){
			for(Person p:people) {
				objOut.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static List<Person> readObjectsFromFile(File f1) throws ClassNotFoundException{
		
		List<Person> people=new ArrayList<>();
		try(ObjectInputStream objInp=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f1)))){
			Object readObject=null;
			while(true) {
				readObject=objInp.readObject();
				if(readObject instanceof Person) {
					people.add((Person) readObject);
				}
			}
		} catch (EOFException e) {
			System.out.println("File Read complete");;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return people;
	}
}
