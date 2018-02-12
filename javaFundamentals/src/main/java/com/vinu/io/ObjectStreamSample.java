package com.vinu.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private char type;
	
//	All that was required to make our previous Animal class serializable in Java was to add
//	implements Serializable to the class definition. Notice that we also added a variable
//	called serialVersionUID. Although this is certainly not required as part of implementing
//	the Serializable interface, it is considered a good practice to do so and update this static
//	class variable anytime you modify the class.
	
	public Animal(String name, int age, char type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	//toString() method will be called when the object is printed
	public String toString() {
		return("Animal [name ="+name+", age = "+age+", type = "+type+"]");
	}
}

public class ObjectStreamSample {
	
	public static void createAnimalsFile(ArrayList<Animal> animList,File dataFile){
		
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(dataFile));
			for (Animal animal:animList) {
				objOut.writeObject(animal);
			}
			objOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static ArrayList<Animal> getAnimals(File dataFile) throws ClassNotFoundException{
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objInp = new ObjectInputStream(new FileInputStream(dataFile));
						
			while (true) {
				Object obj = objInp.readObject();
				if(obj instanceof Animal) {
					animals.add((Animal)obj);
				}
					
			}
			//objInp.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (EOFException e) {
			// TODO Auto-generated catch block
			
			//e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Since we are reading objects, we can’t use a -1 integer value to determine when
//		we have finished reading a file. Instead, the proper technique is to catch an EOFException,
//		which marks the program encountering the end of the file. Notice that we don’t do anything
//		with the exception other than finish the method. This is one of the few times when it
//		is perfectly acceptable to swallow an exception.
		
		return animals;
		}
	
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		File datFile = new File("D:\\WorkBench\\JAVA_Work\\IOArea\\Animals.txt");
		Animal anim1 = new Animal("Tommy Tiger",6,'T');
		Animal anim2 = new Animal("Peter Penguin",2,'P');
		Animal anim3 = new Animal("Ellie Elephant",6,'E');
		ArrayList<Animal> animals=new ArrayList<Animal>();
		
		animals.add(anim1);
		animals.add(anim2);
		animals.add(anim3);
		
		createAnimalsFile(animals,datFile);
		System.out.println(getAnimals(datFile));

	}

}
