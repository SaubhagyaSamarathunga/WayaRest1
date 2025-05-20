/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.io.File;
import java.io.FileOutputStream;

public class JavaApplication12 {
    private static Object e;

    public static void main(String[] args) {
        try{
            File file = new File("textfile1.txt");
            FileOutputStream fop = new FileOutputStream(file);
            if(file.exists()){
                String str = "This data is written through the program";
                fop.write(str.getBytes());
                fop.flush();
                fop.close();
                System.out.println("The data has been written to the file");
            }
            else {
                System.out.println("This file is not exist");
            }
        }catch(Exception ex){
            System.out.println("An error occurded");
            ex.printStackTrace();
        }
    }
    
}
