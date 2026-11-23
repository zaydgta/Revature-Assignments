package vehiclerental;

public class Bike extends Vehicle{
	
	private static double discountRate = 0.1;
	
	public Bike(String vehicleNumber, String model, int ratePerDay, int days){
		super(vehicleNumber, model, ratePerDay, days);
	}
	
	@Override
	public double calculateRent() {
		return super.calculateRent() * discountRate;
	}
	
	@Override
	public void displayDetails() {
		System.out.print("Bike"); 
		super.displayDetails();
		System.out.println();
	}
}
