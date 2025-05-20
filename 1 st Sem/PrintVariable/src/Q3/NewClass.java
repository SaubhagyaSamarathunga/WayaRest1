/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;
import java.util.Scanner;
public class NewClass { 
    public static void main(String[]args){
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        
        System.out.println("Enter num1: ");
        int num2 = in.nextInt();
        
        System.out.println("Addition :" +(num1+num2) );
        System.out.println("Substraction :" +(num1-num2));
        System.out.println("Division :"+(num1/num2));
        System.out.println("Multiplication :"+(num1*num2));
        System.out.println("Remainder :"+(num1%num2));
        
        
    }
    
}
