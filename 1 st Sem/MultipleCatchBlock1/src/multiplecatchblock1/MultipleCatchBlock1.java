/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplecatchblock1;

public class MultipleCatchBlock1 {

   
    public static void main(String[] args) {
       try
       {
           int a[] = new int[5];
           a[5] = 30/0;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("ArrayIndexOutOfBounds Exception occurs");
       }
       catch(ArithmeticException e)
       {
           System.out.println("Arithmetic Exception occurs");
       }
       catch(Exception e)
       {
           System.out.println("Parent Exception occurs");
       }
        System.out.println("Rest of the code");
    }
    
}
