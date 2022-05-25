package week4.day3;

public class Car extends Vehicle {

	public static void main(String[] args) {
	 Car obj=new Car();
	obj.applyBreak();
	obj.soundHorn();
	obj.turnOnAC(); 
	 

	}
	public void turnOnAC()
	{
		System.out.println("Turn on Ac");
	}

}
