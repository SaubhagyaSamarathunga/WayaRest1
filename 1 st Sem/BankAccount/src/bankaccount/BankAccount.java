/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

public class BankAccount {
    public double balance = 50000.0;

    
    public void deposit (double amount) throws NegativeAmountException {
        if (amount < 0){
            throw new NegativeAmountException("Deposit amount cannot be negative");
        }
        balance = balance + amount;
        System.out.println("Deposit successful. New balance: "+ balance);
        
    }
    public void withdraw (double amount) throws InvalidTransactionException {
        if (amount < 0){
            throw new InvalidTransactionException("Withdraw amount cannot be ");
        }
        
        if(amount > balance){
            throw new InvalidTransactionException("Insufficient funds. Cannot");
            
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawal successful. Current balance :"+ balance);
        }
    }
    
}
