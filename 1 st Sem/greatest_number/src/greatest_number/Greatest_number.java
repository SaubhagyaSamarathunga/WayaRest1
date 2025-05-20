/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatest_number;
import java.util.Scanner;
public class Greatest_number {
    public static void main(String[] args) {
        int x,y,z;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
     if(x>y){
         if(x>z){
         System.out.println("Greatest number is " +x);
     }
         else{
             System.out.println("Greatest number is "+z);
         }
    }
     else{
         if(y>z){
             System.out.println("Greatest number is "+y);
         }
         else{
             System.out.println("Greatest number is "+z);
         }
     }
    
}
}
