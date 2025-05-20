/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        
        try{
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
}
