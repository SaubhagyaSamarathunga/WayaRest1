/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee3;

public class Engineer extends Employee3{
    public String programmingLanguage;
    public int yearOfExperience;
    
    void writeCode(){
        System.out.println("Engineer is writing code");
    }
    
    public Engineer(String name, int employeeID, double monthlySalary,String programmingLanguage,int yearOfExperience){
        super(name, employeeID, monthlySalary);
        this.programmingLanguage = programmingLanguage;
        this.yearOfExperience = yearOfExperience;
    }
    public void displayInfo(){
        
    }
    
}
