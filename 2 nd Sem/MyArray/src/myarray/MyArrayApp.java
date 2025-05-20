/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

/**
 *
 * @author U212137
 */
public class MyArrayApp {
      public static void main(String[] args) {
        int max = 20;
       MyArray arr = new MyArray(max);
       
       arr.insert(77);
       arr.insert(99);
       arr.insert(44);
       arr.insert(55);
       arr.insert(15);
       arr.insert(7);
       arr.insert(45);
       arr.insert(89);
       arr.insert(23);
       arr.insert(10);
       
       arr.display();
       
          System.out.println("");
       int searchKey = 90;
       if(arr.find(searchKey)){
           System.out.println("Found"+searchKey);
       }
       else{
           System.out.println("Not Found " +searchKey);
       }
       
       arr.delete(10);
       
       arr.display();
        
    }
    
    
}
