
public class Car {
	private String model = "MyCar";
	private double price;
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public Car() 
	{
		//super();
		this.model="MyNewCar";
		this.price=5000;
	}
	public Car(String model, double price) 
	{
		//super();
		
		this.model = model;
		this.price = price;
	}
	//Business Behaviors
	public double incrementPriceByPercent(double percent)
	{
		this.price=price*(1+percent/100);
		System.out.println("Speed has increased");
		return this.price;		
	}		
}
