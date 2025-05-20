/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student1;

public class Student1 {
    private String name;
    private int age;
public Student1(){
    name = "Unknown";
    age = 0;
}
public Student1(String studentName){
    name = studentName;
    age = 0;
}
public Student1(String studentName, int studentAge){
    name = studentName;
    age = studentAge;
}
public void displayInfo(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
}


   
    public static void main(String[] args) {
        
    }
    
}
