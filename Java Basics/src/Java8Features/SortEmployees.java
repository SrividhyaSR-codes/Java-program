package Java8Features;

import java.util.*;
import java.util.stream.*;

public class SortEmployees {
    static class Employee {
        String name;

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        double salary;
        String dept;

        Employee(String name, double salary, String dept) {
            this.name = name;
            this.salary = salary;
            this.dept = dept;
        }

        public String toString() {
            return name + " (" + dept + ") - ₹" + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sri",    85000, "Engineering"),
                new Employee("Raj",    72000, "Finance"),
                new Employee("Anita",  85000, "Engineering"),
                new Employee("Kumar",  60000, "HR"),
                new Employee("Priya",  72000, "Finance")
        );

        // Sort by salary DESC, then by name ASC
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()
                        .thenComparing(e -> e.name))
                .collect(Collectors.toList());

        System.out.println("Sorted Employees:");
        sorted.forEach(System.out::println);
    }
}
