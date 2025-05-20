/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q7;
import java.util.Scanner;
public class NewClass {
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Celsius value: ");
        int c = in.nextInt();
        float f=(9/5f*c)+32;
        
        System.out.println("Fahrenheit value: "+f)
                
    }
}
