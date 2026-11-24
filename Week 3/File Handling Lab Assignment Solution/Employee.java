package filehandlinglab;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;

	private int empId;
	private String empName;
	private String department;
	private double salary;
	
	public Employee(int empId, String empName, String department, double salary){
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Employee[] employees = new Employee[5];
		
		int empId = 1;
		String empName = "Bob";
		String department = "Marketing";
		double salary = 2000;
		
		for (int i = 0; i < 5; i++) {
			employees[i] = new Employee(empId, empName, department, salary);
			empId++;
			empName += i;
			salary += 2000;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(employees[i]);
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("employees.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("employees.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			oos.writeObject(employees);
			oos.close();
			fos.close();
			
			Employee[] newEmployees = (Employee[]) ois.readObject();
			ois.close();
			fis.close();
			
			for (int i = 0; i < 5; i++) {
				System.out.println(newEmployees[i]);
			}
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			System.out.println("File not found.");
		}
	}
}
