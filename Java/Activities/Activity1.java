package activities;

public class Activity1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car hyundai = new Car();
		hyundai.make=2014;
		hyundai.color="Black";
		hyundai.transmission="Manual";
		
		// Calling Car class methods
		hyundai.displayCharacteristics();
		hyundai.accelarate();
		hyundai.brake();
	}
}
