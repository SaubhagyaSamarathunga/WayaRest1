/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.FileWriter;
import java.io.IOException;

public class JavaApplication11 {

    public static void main(String[] args) {
        try
        {
            FileWriter myWriter = new FileWriter("C:\\Users\\u212137\\Documents\\File Handling\\filename.txt");
            myWriter.write("This data is written through the program");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        
    }
    
}
