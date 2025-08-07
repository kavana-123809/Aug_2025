
package Lab3.com.cg.eis.pl;

import java.util.Scanner;

import Lab3.com.cg.eis.bean.Employee;
import Lab3.com.cg.eis.service.EmployeeService;

public class MainApp {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume leftover newline

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();
	        sc.nextLine(); // consume leftover newline

	        System.out.print("Enter Designation (Manager/Programmer/Clerk): ");
	        String designation = sc.nextLine();

	       
	        //Employee emp = new Employee(id, name, salary, designation);
	        Employee emp = new Employee(id, name, salary, designation);

	        EmployeeService service =  new EmployeeServiceImpl();
	        service.getScheme(emp);

	        System.out.println("\n" + emp);
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
	    }
}