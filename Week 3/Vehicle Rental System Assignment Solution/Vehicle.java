package vehiclerental;

public class Vehicle {
	private String vehicleNumber;
	private String model;
	private int ratePerDay;
	private int days;
	
	public Vehicle(String vehicleNumber, String model, int ratePerDay, int days) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
	public double calculateRent() {
		return this.ratePerDay * this.days;
	}
	
	public void displayDetails() {
		System.out.print(" | " + vehicleNumber + " | " + model + " | Days: " + days + " | " + this.calculateRent());
	}
	
	
}
