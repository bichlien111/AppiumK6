package lab_08_1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        for (Employee employee : employeeList) {
            int randomNumber = new SecureRandom().nextInt(2);
            if(randomNumber == 0) {
                employee.setFulltime(true);
            }
            else {
                employee.setFulltime(false);
            }
            System.out.printf("%s\n", employee.isFulltime()?"Fulltime":"Contract");
        }

        int totalSalary = 0;
        for (Employee employee : employeeList) {
            if(employee.isFulltime()==true){
                employee.setSalary(50000);
            }else{
                employee.setSalary(40000);
            }
            totalSalary +=  employee.getSalary();
        }
        System.out.println("Total salary: " + totalSalary);
    }
}
