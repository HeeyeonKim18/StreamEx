package com.example.streamEx.stream;

import java.util.ArrayList;

public class FindFirstExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 23000));
        employees.add(new Employee(2, "Doug", 190000));
        employees.add(new Employee(3, "Jack", 200000));
        employees.add(new Employee(4, "Daisy", 240000));
        employees.add(new Employee(5, "William", 220000));

        Employee firstEmp = employees.stream()
                .filter(emp -> emp.getEmpName().startsWith("J")).findFirst().get();

        System.out.println("firstEmp = " + firstEmp);
    }
}
