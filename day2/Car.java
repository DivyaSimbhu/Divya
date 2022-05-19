package week2.day2;

public class Car {
	public void applyBrake()
{
		System.out.println("Apply Brake");
	}
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	public void switchOnAc()
	{
		System.out.println("Turn on Ac");
	}
	public void switchOffAc()
	{
		System.out.println("Turn Off Ac");
	}
	
	public static void main(String[] args)
	{
	Car myCar = new Car();
	myCar.applyBrake();
	myCar.applyGear();
	myCar.switchOnAc();
	myCar.switchOffAc();
	
		}
	}
	
	

