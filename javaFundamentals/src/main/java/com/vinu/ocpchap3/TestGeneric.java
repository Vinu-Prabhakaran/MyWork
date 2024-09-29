/**
 * 
 */
package com.vinu.ocpchap3;

/**
 * @author Vinu Prabhakaran
 *         on Jul 10, 2021
 *
 */
interface Shippable<T> {
void ship(T t);
}

class Robot{
	
}

class ShippableRobot implements Shippable<Robot>{

	@Override
	public void ship(Robot t) {
		// TODO Auto-generated method stub
		
	}
	
}
class ShippableRobotNew<U> implements Shippable<U>{

	@Override
	public void ship(U t) {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestGeneric {

}
