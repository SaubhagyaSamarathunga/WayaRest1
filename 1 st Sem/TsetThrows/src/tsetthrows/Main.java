/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsetthrows;

//main method
public class Main {
    public static void main(String[] args) {
        TsetThrows obj = new TsetThrows();
        
        try
        {
            System.out.println(obj.divideNum(45,0));
        }
        catch(ArithmeticException e)
        {
            System.out.println("");
        }
    }
    
}
