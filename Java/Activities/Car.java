package activities;

public class Car {
	String color, transmission;
	int make, tyres, doors;
	
	Car() {
		tyres=4;
		doors=4;			
	}
	
	void displayCharacteristics(){
		System.out.println("Color of the Car: " + color);
		System.out.println("Transmission of the Car: " + transmission);
		System.out.println("Make of the Car: " + make);
		System.out.println("Tyres of the Car: " + tyres);
		System.out.println("Doors of the Car: " + doors);
	}
	
	void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	void brake() {
		System.out.println("Car has stopped.");
	}
}
