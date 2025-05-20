/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.io.File;

public class JavaApplication15 {

    public static void main(String[] args) {
        
            File myObj = new File("filename.txt");
            if(myObj.delete()){
                System.out.println("File deletted: ");
            }
            else{
                System.out.println("Failed to delete the file.");
            }
        }catch (Exception ex){
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
    


    
