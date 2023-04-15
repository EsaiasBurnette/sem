package com.napier.sem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();
        // Get Employee
      /*  Employee emp = a.getEmployee(476916);
        // Display results
        a.displayEmployee(emp);

        // Extract employee salary information
        ArrayList<Employee> employees = a.getAllSalaries();

        // Test the size of the returned data - should be 240124
        System.out.println(employees.size());

        // Print a list of all salary information
        a.printSalaries(employees); */

        // print a list of salaries by department
        Department dep = a.getDepartment();
        // Display results
        a.displayDepartment(dep);

        // Disconnect from database
        a.disconnect();
    }

}