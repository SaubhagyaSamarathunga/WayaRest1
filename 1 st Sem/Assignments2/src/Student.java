/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u212137
 */
public class Student {
    private String name;
    private int age;
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void study(){
        System.out.println("Student is studying.");
    }
    void attendClasses(){
        System.out.println("Student is attending classes.");
    }
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    
}
