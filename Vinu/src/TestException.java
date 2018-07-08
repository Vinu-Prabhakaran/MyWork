import com.tcs.myApp.model.ExLearnClass;
import com.tcs.myApp.model.MyCustomException;


public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExLearnClass me = new ExLearnClass();
        me.setInitialValues(7, new int[]{3,4,5,6}, "Vinu Prabhakaran");
        try{
            me.showName();
        }
        catch(MyCustomException ex)
        {
            
                        }
        try{
            System.out.println(5/me.getDenominator());
            //System.out.println(me.getNumList()[4]);
            //System.out.println(me.getName().toString());
        }
        catch(ArithmeticException ae)
        {
            //ae.printStackTrace();
            //ae.getMessage();
            System.out.println("Arithmetic exception encountered");
        }
        catch(ArrayIndexOutOfBoundsException arre)
        {
            //arre.printStackTrace();
            //arre.getMessage();
            System.out.println("Array out of bound exception encountered");
        }
        catch(NullPointerException npe)
        {
            //npe.printStackTrace();
            //npe.getMessage();
            System.out.println("Null Pointer exception encountered");
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            //e.getMessage();
            System.out.println("General exception encountered");
        }
        finally
        {
            System.out.println("This will FINALLY get executed");
        }
        

	}

}
