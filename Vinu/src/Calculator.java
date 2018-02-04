
public class Calculator 
{
	private double valueOne;
	private double valueTwo;
	public double getValueOne() {
		return valueOne;
	}
	public void setValueOne(double valueOne) {
		this.valueOne = valueOne;
	}
	public double getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(double valueTwo) {
		this.valueTwo = valueTwo;
	}
	public Calculator(double valueOne, double valueTwo) {
		super();
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	//Add method
	public double add(double valueOne,double valuetwo) 
	{
		return valueOne + valueTwo;
	}
	//Subtract method
	public double subtract(double valueOne,double valuetwo) 
	{
		return valueOne - valueTwo;
	}
	//Mutliply method
	public double multiply(double valueOne,double valuetwo) 
	{
		return valueOne * valueTwo;
	}
	//Division method
	public double divide(double valueOne,double valuetwo) 
	{
		if (valuetwo == 0)
		{
			System.out.println("Division by zero!!!");
			return 0;
		}
		else
		{
			return valueOne / valueTwo;
		}
	}
}
