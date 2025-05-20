/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package except1;
import java.io.*;
public class Except1 {

    public static void main(String[] args) {
        try
        {
            int x=1/0;
            System.out.println("Value of x :"+x);
        }
        catch(Exception e)
        {
            System.out.println("Exception thrown :"+e);
        }
    }
    
}
