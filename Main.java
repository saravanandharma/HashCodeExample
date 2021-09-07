package com.saravanan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Employee employee = new Employee(1, "Mahith Dharma", "CEO", 999000);
    Employee employee1 = new Employee(2, "Srivathsa", "MD", 200000);
    Employee employee2 = new Employee(3, "Amit Shah", "MD", 165000);

        List<Employee>  employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);

        System.out.println(employeeList.contains(employee1));

        List<Employee> employeeList1 = Arrays.asList(employee, employee1, employee2);
        System.out.println(employeeList1.contains(employee2));

        System.out.println(employee.equals(employee1));

        // hashCode() are invoked
        System.out.println(" hashCode() will be invoked for the following operation...");
        Map<Employee, Employee>  employeeEmployeeLinkedHashMap = new LinkedHashMap<Employee, Employee>();
        employeeEmployeeLinkedHashMap.put(employee, employee1);
        employeeEmployeeLinkedHashMap.put(employee1, employee);
        employeeEmployeeLinkedHashMap.put(employee2, employee1);

        if(employeeEmployeeLinkedHashMap.containsKey(employee))
            System.out.println("Employee1 found in the Map");

        if(employeeEmployeeLinkedHashMap.containsValue(employee2))
            System.out.println("Employee 2 found in the Map");

    }
}
