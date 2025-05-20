/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

public class Shapes {
    public double length;
    public double radius;
    public double width;
        public double area(int radius)
        {
            return Math.PI*radius*radius;
        }
        public double area(int length, int width)
        {
            return length*width;
        }

    public static void main(String[] args) {
        
    }
    
}
