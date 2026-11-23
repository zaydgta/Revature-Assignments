package vehiclerental;

public class Car extends Vehicle {
	
	private double insuranceRate;
	
	public Car(String vehicleNumber, String model, int ratePerDay, int days, double insuranceRate){
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceRate = insuranceRate;
	}
	
	
	@Override
	public double calculateRent() {
		return super.calculateRent() + this.insuranceRate;
	}
	
	@Override
	public void displayDetails() {
		System.out.print("Car"); 
		super.displayDetails();
		System.out.println();
	}
	
}
