/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

public class NewClass {
    public static void Main(String[]args){
        for(int i=1; i<=2; i++){
            System.out.println("Outer: "+i);
        for(int j=1; j<=3; j++){
            System.out.println("Inner: "+j);
        }
        }
    }
    
}
