/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


public class Main5 {
    public static void main(String[]args){
        int[]myNumbers = {10,20,30,40,50,60,70,80,90};
        int sum = 0;
        for(int i=0; i<myNumbers.length;i++){
            sum = sum + myNumbers[i];
        }
        System.out.println("Sum = "+sum);
    }
    
}
