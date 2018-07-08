import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Basics {
	
	private int val;
	
	public Basics(int a) {
		
	}
	
	boolean sell() {
		
		int price = 10;
		if(price<10) {
			return true;
		}else if (price >=10) {
			return false;
		}else			//will not compile without this else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[];
		name = new String[10];
		for (int i=0;i<10;i++) {
			System.out.println("Enter name#"+(i+1)+" :");
		}
		
		
		Object ob1 = new Object();
		Object ob2 = new Object();
		Object ob3 = ob1;
		
		System.out.println(ob1 == ob2);
		
		String myArr[]= {"212","ass","Assd","32"};
		Arrays.sort(myArr);
		System.out.println(Arrays.toString(myArr));
		
		ArrayList<Integer> myAList = new ArrayList<>();
		myAList.add(3);
		myAList.add(2);
		myAList.add(1);
		myAList.add(0);
		myAList.remove((Integer)0);
		System.out.println(myAList);
		System.out.println("Replacing element "+myAList.set(1,5));
		
		//Basics b - new Basics();    	//important there in no default constructor here
		Basics b1 = new Basics(2);
		System.out.println(b1.val);
		
		int dog = 11;
		int cat = 3;
		int partA = dog/cat;
		System.out.println("partA = "+partA);
		int partB = dog % cat;
		int newDog = partB + partA * cat;
		System.out.println(newDog);

		String myTestVariable="Zvinu";
		System.out.println(myTestVariable.equals(null));
		
		char[][] ticTacToe = new char[3][3]; 	// r1
		//ticTacToe[0][0] = 'X'; 					// r2
		//ticTacToe[1][1] = 'X';
		//ticTacToe[2][2] = 'X';
		System.out.println(ticTacToe.length + " in a row!"+ticTacToe[0][0]); // r3
		
		
		StringBuilder sb = new StringBuilder("animal");
		sb.insert(6,"kingdom");
		System.out.println(sb);
		System.out.println(sb.indexOf("z"));
		
		int[] numArr = {0,2,3,4};
		System.out.println(Arrays.binarySearch(numArr,1));
		
		List list1 = new ArrayList<>();
		List list2 = new ArrayList();
		List<String> list3 = new ArrayList();
		List<String> list4 = new ArrayList<>();
		List<String> list5 = new ArrayList<String>();
		
		String temp = null;
		System.out.println(temp==null);
		System.out.println(temp.equals(null));
		
		
		
	}

}
