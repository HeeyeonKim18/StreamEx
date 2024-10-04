package com.example.streamEx.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 23000));
        employees.add(new Employee(2, "Doug", 190000));
        employees.add(new Employee(3, "Jack", 200000));
        employees.add(new Employee(4, "Daisy", 240000));
        employees.add(new Employee(5, "William", 220000));

        // ex1: print the employee data using the stream
        employees.stream().forEach(employee -> System.out.println(employee));

        // ex2: print the employee data by sorting employee salaries in descending order
        List<Employee> sortedDescOrder = employees.stream().sorted((Comparator.comparingLong(Employee::getEmpSalary).reversed())).collect(Collectors.toList());
        sortedDescOrder.forEach(employee -> System.out.println(employee));

        // ex3: filter the employee names starting with 'J'
        employees.stream()
                .filter(employee -> employee.getEmpName().startsWith("J"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // ex4: add 10000 to each employee's salary and print
        List<Long> salary =
                employees.stream()
                        .map(employee -> employee.getEmpSalary() + 10000)
                        .collect(Collectors.toList());
        salary.forEach(System.out::println);

        // ex5: return the employee object having max salary
        Employee employee = employees.stream()
                .reduce(
                        (employee1, employee2) ->
                                employee1.getEmpSalary() > employee2.getEmpSalary() ? employee1 : employee2)
                .get();
        System.out.println("Max salary = " + employee);
    }
}
