/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_answer;
import java.util.Scanner;
public class Q1_Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int evenCount = 0;
        int oddCount = 0;
        int number;
        
        System.out.println("Enter a series of numbers that terminates by-1: ");
        while(true){
            number = scanner.nextInt();
            if(number == -1){
                break;
            } else if (number % 2==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
    }
    
}
