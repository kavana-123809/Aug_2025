package Lab2_3com.cg.eis.service;

import Lab2_3com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void getScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            emp.setInsuranceScheme("Scheme C");
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            emp.setInsuranceScheme("Scheme B");
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            emp.setInsuranceScheme("Scheme A");
        } else {
            emp.setInsuranceScheme("No Scheme");
        }
    }

    @Override
    public void displayDetails(Employee emp) {
        System.out.println(emp);
    }

}
