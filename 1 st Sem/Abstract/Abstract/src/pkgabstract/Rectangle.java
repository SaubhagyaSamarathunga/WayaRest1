/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

public class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(String color, double length, double width){
        
        super (color);
        System.out.println("Rectangle constructor called ");
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return length*width;
    }
    @Override
    public String toString(){
        return"Circle color is "+super.getColor()+" and area is"+area();
    }
    
    
}
