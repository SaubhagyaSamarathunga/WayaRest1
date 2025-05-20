/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package savingaccount;

public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;

    void MonthlyInterest(){
        MonthlyInterest = savingBalance * (annualInterestRate / 12);
        savingBalance = savingBalance + MonthlyInterest;
        
        System.out.println("Current saving balance: " + savingBalance);
        System.out.println("Monthly Interest :" + MonthlyInterest);
        }

       public SavingAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }
        public void calculateMonthlyInterst(){
     
    }

        static void modifyInterestRate(double newInterestRate){
            annualInterestRate = newInterestRate;
    }
  
}
