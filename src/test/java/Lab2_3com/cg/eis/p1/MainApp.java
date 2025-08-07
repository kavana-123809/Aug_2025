package Lab2_3com.cg.eis.p1;

import java.util.Scanner;

import Lab2_3com.cg.eis.bean.Employee;
import Lab2_3com.cg.eis.service.EmployeeService;
import Lab2_3com.cg.eis.service.EmployeeServiceImpl;

public class MainApp {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Employee ID:");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.println("Enter Employee Name:");
	        String name = sc.nextLine();

	        System.out.println("Enter Salary:");
	        double salary = sc.nextDouble();
	        sc.nextLine(); // consume newline

	        System.out.println("Enter Designation:");
	        String designation = sc.nextLine();

	        Employee emp = new Employee(id, name, salary, designation);
	        EmployeeService service = new EmployeeServiceImpl();
	        service.getScheme(emp);
	        service.displayDetails(emp);
	        
	        sc.close();
	    }

}
