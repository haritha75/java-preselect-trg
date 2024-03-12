import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

  public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 500000));
        employees.add(new Employee(2, "Alice", 350000));
        employees.add(new Employee(3, "Bob", 450000));
        employees.add(new Employee(4, "Emma", 380000));

        System.out.println("Employees with salary > 400000:");
        employees.stream()
                 .filter(emp -> emp.getSalary() > 400000)
                 .forEach(emp -> System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary()));

        employees.forEach(emp -> emp.setSalary(emp.getSalary() * 1.25));

        System.out.println("\nEmployees with updated salaries:");
        employees.forEach(emp -> System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary()));

        List<String> empNames = employees.stream()
                                        .map(Employee::getName)
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        System.out.println("\nUppercase Names:");
        empNames.forEach(System.out::println);
    }
}
  

