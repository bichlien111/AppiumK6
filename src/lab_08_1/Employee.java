package lab_08_1;

/* Create a class Employee with a method salary to return employee’s salary
 * There are 2 types of employee: Full time employee and contract employee
 * Full time employee has salary is 50000 and contract employee has salary 40000
 * Write a method to accept a list of Employee and calculate total salary
 * For example, company has 3 FTE and 2 contractor
 * */

public class Employee {
    private int salary;
    private boolean fulltime;

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }
}
