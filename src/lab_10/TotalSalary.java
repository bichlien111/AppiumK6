package lab_10;
/* Do with abstraction:
 * Create a class Employee with a method salary to return employee’s salary
 * There are 2 types of employee: Full time employee and contract employee
 * Full time employee has salary is 50000 and contract employee has salary 40000
 * Write a method to accept a list of Employee and calculate total salary
 * For example, company has 3 FTE and 2 contractor
 * */

import java.util.Arrays;
import java.util.List;

public class TotalSalary{
    public static void main(String[] args) {
        List<Employee> employeelist = Arrays.asList(new FTE(), new FTE(), new Contract());
        int totalSalary = 0;
        for (Employee employee : employeelist) {
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println("Total Salary = " + totalSalary);
    }
}
