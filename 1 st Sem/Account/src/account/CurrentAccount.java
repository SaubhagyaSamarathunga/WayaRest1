/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
    
public class CurrentAccount extends Account {
    public double overdraftLimit;
    public double withdrawalAmount;
    
    public CurrentAccount(int accNumber, String accHolderName, double balance,double overdraftLimit, double withdrawalAmount){
        super(accNumber, accHolderName, balance);
        this.overdraftLimit = overdraftLimit;
        this.withdrawalAmount = withdrawalAmount;
        
    }
    
}
