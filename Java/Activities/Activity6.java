package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		//Add passengers on the list
		plane.onboard("Ram");
		plane.onboard("Shyam");
		plane.onboard("Ravi");
		// Take off Flight
		System.out.println("Plane took off at: "+plane.takeOff());
		// Get Flight
		System.out.println("People on the plane: "+plane.getPassengers());
		// Flight Emulation
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Land Flight
		plane.land();
		System.out.println("Plane landed at: "+plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: "+ plane.getPassengers());
	}

}

@SuppressWarnings("unused")
class Plane{
	private List<String> passengers;	
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
    
	public Plane(int passengers) {
		this.maxPassengers = passengers;
		this.passengers = new ArrayList<>();
	}
	
	void onboard(String passenger) {
		this.passengers.add(passenger);
	}
	
	Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}