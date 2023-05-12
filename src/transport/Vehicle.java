package transport;

public class Vehicle {
	
	private int nWheels;

	public Vehicle(int wheels) {
		nWheels = wheels;
		
		System.out.println("Vehicle constructor");
	}
	
	public static void main(String[] args) { Vehicle v = new Vehicle(4); }
}
