/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.io.File;
import java.io.IOException;

public class JavaApplication10 {

    public static void main(String[] args) {
        try{
            File myObj = new File("Z:\\JavaApplication10\\filename.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
