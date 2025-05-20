/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinputexample;

import java.util.Scanner;
public class ArrayInputExample {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:"); /*reading the nymber of 
                elements from the that we want to enter*/
        n = sc.nextInt(); 
        int[] array = new int[10]; //Creates an array in the memory of length 10
        System.out.println("Enter the elements of the array:");
        
        for(int i=0; i<n; i++)//reading array elements from the user
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");//Accessing array elements using the for loop
        
        for (int i=0; i<n; i++){
            System.out.println("["+array[i]+"]");
        }
        
        int key;
        System.out.println("Enter the element you want to find: ");
        key = sc.nextInt();
        
        for(int i=0; i<n; i++){
            if(array[i]== key){
                System.out.println(key); //System.out.println(i)
            }
            else{
                System.out.println("Key is not in array");
            }
        }
    }
    
}
