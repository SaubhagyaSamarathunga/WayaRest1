/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee3;

public class Manager extends Employee3 {
    public String department;
    public int numberOfSubordinates;
    
    public void conductMeeting(){
        System.out.println("Manager is conducting a meeting");
    }
    public Manager(String name, int employeeID, double monthlySalary, String department,int numberOfSubordinates){
        super(name, employeeID, monthlySalary);
        this.numberOfSubordinates = numberOfSubordinates;
        this.department = department;
    }
    
}
