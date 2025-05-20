/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularshapes;

import java.util.Scanner;
public class CircularShapes {

   private double radius;
   //Constructor to initialize the radius
    public CircularShapes(double radius){
        this.radius = radius;
    }
    
    //Method to calculate the area of a circle
    public double areaofCircle(){
        return Math.PI * Math.pow(radius, 2);
    }  

    //Method to calculate the perimeter of a circle
    public double perimeterofCircle(){
        double x=2*Math.PI * radius;
        return x;
    }
    //Method to calculate the surface area of a cylinder, 2 circle+rectangle
    public double surfaceAreaofCylinder (double height){
        double circleArea= areaofCircle();
        double lateralSurfaceArea = perimeterofCircle() * height;
        return 2 * circleArea + lateralSurfaceArea;
    }
    //Method to calculate the volume of a cylinder
    public double volumeofCylinder(double height){
        return areaofCircle() * height;
    }

public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    //Input the radius and height from the user
    System.out.print("Enter the radius of the cylinder: ");
    double radius = scanner.nextDouble();
    
    System.out.print("Enter the height of the cylinder: ");
    double height = scanner.nextDouble();
    
    //Create an instance of CircularShapes
    CircularShapes circularShapes = new CircularShapes(radius);
    
    //Calculate and print the results
    double circleArea = circularShapes.areaofCircle();
    double circlePerimeter = circularShapes.perimeterofCircle();
    double cylinderSurfaceArea = circularShapes.surfaceAreaofCylinder(height);
    double cylinderVolume = circularShapes.volumeofCylinder(height);
    
    System.out.println("Area of the circle: " + circleArea);
    System.out.println("Perimeter of the circle: " + circlePerimeter);
    System.out.println("Surface area of the cylinder: " + cylinderSurfaceArea);
    System.out.println("Volume of the cylinder: " + cylinderVolume);
    
    scanner.close();
    
}
    

}
