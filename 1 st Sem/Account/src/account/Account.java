/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author u212137
 */
public class Account {
    public int accNumber;
    public String accHolderName;
    public double balance;
    
    public void deposit(double amount){
        balance += amount; 
    }
    public void withdrawal(double amount){ 
        if(amount <= balance) {
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds!");
        }
    }
    
    public Account(int accNumber, String accHolderName, double balance){
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.balance = balance;
    }
}
    
    
    


  
