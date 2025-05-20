/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student1;

public class main {
    public static void main(String[] args) {
        Student1 p1 = new Student1();
        Student1 p2 = new Student1("Sajani");
        Student1 p3 = new Student1("Sajani",23);
        
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        
    }
    
}
