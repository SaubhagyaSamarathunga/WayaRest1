/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

public class SavingAccount extends Account {
    public double interestRate;
    
    public SavingAccount(double interestRate , int accNumber, String accHolderName, double balance){
      super(accNumber, accHolderName, balance);
      this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        balance += balance * (interestRate / 100);
    }

}
