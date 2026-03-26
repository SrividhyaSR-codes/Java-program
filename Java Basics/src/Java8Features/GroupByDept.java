package Java8Features;
import java.util.*;
import java.util.stream.*;
//Group employees by department and find highest salary in each dept, also calculate average salary per dept
public class GroupByDept {

    record Employee(String name, String dept, double salary) {}

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sri",   "Engineering", 85000),
                new Employee("Raj",   "Finance",     72000),
                new Employee("Anita", "Engineering", 91000),
                new Employee("Kumar", "HR",          60000),
                new Employee("Priya", "Finance",     78000)
        );

        // Group by dept → max salary in each group
        Map<String, Optional<Employee>> topEarners = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::dept,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::salary))
                ));

        System.out.println("Top earner per department:");
        topEarners.forEach((dept, emp) ->
                System.out.println(dept + " → " + emp.map(Employee::name).orElse("N/A"))
        );

        // Department-wise average salary
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::dept,
                        Collectors.averagingDouble(Employee::salary)
                ));

        System.out.println("\nAverage salary per dept:");
        avgSalary.forEach((dept, avg) ->
                System.out.printf("%s → %.2f%n", dept, avg)
        );
    }
}
