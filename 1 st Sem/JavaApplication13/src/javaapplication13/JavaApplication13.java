/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import javafx.scene.chart.PieChart.Data;

public class JavaApplication13 {

    public static void main(String[] args) {
        try{
            DataOutputStream dos = new Data OutputStream(new BufferedOutPutStream(new File("Mytest.txt")));
            String s = "This data is written through the program";
            dos.write(s.getButes());
            dos.close();
        }catch(Exception ex){
            System.out.println("An error occurred");
            ex.printStackTrace();
        }
        
    }
    
}
