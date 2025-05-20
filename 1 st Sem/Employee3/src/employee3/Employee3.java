/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee3;

public class Employee3 {
    public String name;
    public int employeeID;
    public double monthlySalary;
    
    public void displayInfo(String name, int employeeID, double monthlySalary){
        System.out.println("Employee name is "+ name);
        System.out.println("EmployeeID is "+ employeeID);
        System.out.println("Monthly Salary is "+ monthlySalary);
    }
    public Employee3 (String name, int employeeID, double monthlySalary){
        this.employeeID = employeeID;
        this.monthlySalary = monthlySalary;
        this.name = name;
    }
    
}
