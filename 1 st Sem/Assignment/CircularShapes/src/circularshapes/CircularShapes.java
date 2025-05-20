/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularshapes;

public class CircularShapes {
    
    final double pi = 3.14;
    double radius;
    double AreaofCircle() {
       return radius*radius*pi;
    }
    double PerimeterofCircle() {
        return 2*pi*radius;
    }
    double height;
    double AreaofCylinder (){
        return PerimeterofCircle()*height + AreaofCircle()*2;
    }
    double VolumeofCylinder (){
        return AreaofCircle()*height;
    }


import java util.Scanner;
public static void main(String[]args);
Scanner input = newScanner;





}

