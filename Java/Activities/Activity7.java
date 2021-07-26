package activities;

interface BicycleParts {
	public int gears=0;
	public int speed=0;
}

interface BicycleOperations {
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

//Base class
class Bicycle implements BicycleParts, BicycleOperations {
	int gears, currentSpeed;
	
	// Constructor
	Bicycle(int gear, int currentSpeed){
		this.gears = gear;
		this.currentSpeed = currentSpeed;
	}
	
	// Definition of applyBrake
	public void applyBrake(int decrement) {
		this.currentSpeed -= decrement;
		System.out.println("Current speed of bicycle is " + this.currentSpeed);
	}

	// Definition of speedUp
	public void speedUp(int increment) {
		this.currentSpeed += increment;
		System.out.println("Current speed of bicycle is " + this.currentSpeed);
	}
	
	// Bicycle Description
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
}

class MountainBike extends Bicycle {
	int seatHeight;
	
	// Constructor
	MountainBike(int gear, int currentSpeed, int seatHeight) {
		super(gear, currentSpeed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
	    return(super.bicycleDesc() + "\nSeat of bicycle is " + seatHeight);
	}
}

//Driver class 
public class Activity7 {
  public static void main(String args[]) {
      MountainBike mb = new MountainBike(3, 0, 25);
      System.out.println(mb.bicycleDesc());
      mb.speedUp(20);
      mb.applyBrake(5);
  }
}
