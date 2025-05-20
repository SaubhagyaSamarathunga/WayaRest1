/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0array;
import java.util.*;
public class Main {

    public static void main(String[] args) {
       int given_number = 9;
       int a[] = {12, 10, 14, 15, 16};
       Arrays.sort(a);
       
       int new_array[] = new int[a.length+1];
       
       int i = 0, j = 0;
       for(i=0; i<new_array.length; i++){
           if(given_number <= a[i]){
               new_array[i] = given_number;
               break; 
           }
           else
               new_array[i]=a[j++];
       }
       
       for(int k = i+1; k<new_array.length; k++)
           new_array[k] = a[j++];
       
       for(i=0; i<new_array.length; i++){
           
            System.out.println(new_array[i] +" ");
        }
       
    }
    
}
