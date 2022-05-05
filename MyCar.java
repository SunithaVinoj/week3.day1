package week3.day1;

public class MyCar {
public static void main(String[] args) {
	
	BMW b=new BMW();
	Car c=new Car();
	Vehicle v=new Vehicle();
	
	System.out.println("Calling methods from class BMW     ");
	
	b.autoPark();
	b.handBrake();
	b.turnAC();
	
	System.out.println("Calling methods from class Car   ");
	
	c.handBrake();
	c.turnAC();
	c.applyBrake();
	c.soundHorn();
	
	System.out.println("Calling methods from class Vehicle   ");
	v.applyBrake();
	v.soundHorn();
	
	
	
	
	
		
	}


}
