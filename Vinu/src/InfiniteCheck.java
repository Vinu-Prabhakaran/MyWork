
public class InfiniteCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool = false;
		do {
			if(!bool) {
				System.out.println(bool);
				bool = true;
				System.out.println("inflate-");
			}
		} while(!bool);	// change to while(bool) and see
		
		System.out.println("done");
		

	}

}
