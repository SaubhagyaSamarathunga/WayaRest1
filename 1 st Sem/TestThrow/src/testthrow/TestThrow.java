/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthrow;

public class TestThrow {

    
    public static void checkNum(int num) { //defining a method
        if(num < 1)
        {
            throw new ArithmeticException("/nNumber is negative, cannot calculate square");
        }
        else
        {
            System.out.println("Square of " +num + "is" + (num*num));
        }
    }
    
    
}
