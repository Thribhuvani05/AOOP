package Com.Manage_Emp_Salary;

public class Main {
	public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", "Manager");
        Employee emp2 = new Employee("Jane Smith", "Developer");
        Employee emp3 = new Employee("Bob Johnson", "Intern");

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println(emp1 + ", Salary: $" + salaryCalculator.calculateSalary(emp1));
        System.out.println(emp2 + ", Salary: $" + salaryCalculator.calculateSalary(emp2));
        System.out.println(emp3 + ", Salary: $" + salaryCalculator.calculateSalary(emp3));
    }
}
