/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

public class Student {
    private String name;
    private int[] marks;
    
    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;  
    }
    public double calculateAverage() {
        int totalMarks = 0;
        for(int mark: marks) {//for-each loop
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }
    
    public boolean isPassed(){
        return calculateAverage() >= 40;
    }
    
    public void displaydetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Marks in Subjects: ");
        for(int mark: marks) {
            System.out.println(mark + " ");
        }
        System.out.println("\nAverage Marks: " + calculateAverage());
        System.out.println("Pass");
    }
}
    
 public class Problemsheet1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for student 1: ");
        System.out.println("Name: ");
        String name1 = scanner.nextLine();
        System.out.println("Number");   
    
}

