/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptest;

import java.io.*;
public class ExcepTest {

    public static void main(String[] args) {
        try
        {
            int a[] = new int[2];
            System.out.println("Access element three : "+a[3]);
        }
        catch(Exception e)
        {
            System.out.println("Exception thrown :"+ e);
        }
    }
    
}
