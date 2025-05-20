/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author u212137
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=1; i<=2; i++){
            System.out.println("Outer: "+i);
        for(int j=1; j<=3; j++){
            System.out.println("Inner: "+j);
        }
    }
    
}
}