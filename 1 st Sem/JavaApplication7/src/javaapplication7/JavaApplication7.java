/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Input a Number:");
      int x = Int.nextInt();
      if(x>0){
          System.out.println("Positive");
      }
      else if(x<0){
          System.out.println("Negative");
      } 
      else{
          System.out.println("Number is Zero");
      }
      
    }
    
}
