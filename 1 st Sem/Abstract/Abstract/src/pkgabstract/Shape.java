/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

abstract class Shape {
    String color;
    
    abstract double area();
    @Override
    public abstract String toString();
    
    public Shape(String color)
    { 
        System.out.println("Shape constuctor called");
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    
    
}
