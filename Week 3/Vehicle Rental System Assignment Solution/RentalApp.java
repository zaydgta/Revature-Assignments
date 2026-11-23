package vehiclerental;
import java.util.Scanner;

public class RentalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of vehicles: ");
		int vehicleCount = sc.nextInt();
		sc.nextLine();
		Vehicle[] vehicles = new Vehicle[vehicleCount];
		
		for (int i = 0; i < vehicleCount; i++) {
			
			System.out.print("Enter type (1-Car, 2-Bike): ");
			int vehicleType = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Vehicle Number: ");
			String vehicleNumber = sc.nextLine();
			System.out.print("Enter Model: ");
			String vehicleModel = sc.nextLine();
			System.out.print("Enter Rate per Day Number: ");
			int ratePerDay = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Days: ");
			int days = sc.nextInt();
			sc.nextLine();
			
			if (vehicleType == 1) {
				System.out.print("Enter Insurance per Day: ");
				double insuranceRate = sc.nextDouble();
				sc.nextLine();
				vehicles[i] = new Car(vehicleNumber, vehicleModel, ratePerDay, days, insuranceRate);
			} else {
				vehicles[i] = new Bike(vehicleNumber, vehicleModel, ratePerDay, days);
			}
			
		}
		
		double totalRent = 0;
		System.out.println("--- Rental Details ---\n");
		for (int j = 0; j < vehicles.length; j++) {
			vehicles[j].displayDetails();
			totalRent += vehicles[j].calculateRent();
		}
		
		System.out.println("Total Rent Collected: " + totalRent);
	}

}