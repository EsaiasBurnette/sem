package com.napier.sem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        if(args.length < 1){
            a.connect("localhost:33060", 0);
        }else{
            a.connect("db:3306", 30000);
        }

        // Get Employee
        Employee emp = a.getEmployee(476916);
        // Display results
        a.displayEmployee(emp);

        // Extract employee salary information
        ArrayList<Employee> employees = a.getAllSalaries();

        // Test the size of the returned data - should be 240124
        System.out.println(employees.size());

        // Print a list of all salary information
        a.printSalaries(employees);

        // Disconnect from database
        a.disconnect();
    }

}