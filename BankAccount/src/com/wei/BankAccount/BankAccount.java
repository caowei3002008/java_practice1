package com.wei.BankAccount;
import java.util.concurrent.ThreadLocalRandom;

class BankAccount {
    private String AccountNumber;
    private double CheckingBalance;
    private double SavingBalance;
    private static int CountsOfAccount = 0;
    private static double TotalBalance = 0;

    private String AccountNumberCreate(){
        long AccountNumber = ThreadLocalRandom.current().nextLong(1000000000,1999999999);
        String AccountNumber1 = Long.toString(AccountNumber);
        return AccountNumber1;
    }

    public BankAccount() {
        this.AccountNumber = AccountNumberCreate();
        this.CheckingBalance = 0;
        this.SavingBalance = 0;
        CountsOfAccount++;
    }

    public BankAccount(double checkingBalance, double savingBalance) {
        this.AccountNumber = AccountNumberCreate();
        this.CheckingBalance = checkingBalance;
        this.SavingBalance = savingBalance;
        CountsOfAccount++;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getCheckingBalance() {
        return CheckingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public static int getCountsOfAccount() {
        return CountsOfAccount;
    }

    public static double getTotalBalance() {
        return TotalBalance;
    }

    public void depositIntoChecking(double balance){
        this.CheckingBalance += balance;
        TotalBalance +=balance;
    }
    public void depositIntoSaving(double balance){
        this.SavingBalance += balance;
        TotalBalance +=balance;

    }
    public void WithdrawlChecking(double balance){
        if(balance>this.CheckingBalance){
            System.out.println("Not enough money to withdraw");
        }else{
            this.CheckingBalance -= balance;
            TotalBalance +=balance;
            System.out.println("Withdraw Successfully, your current checking account balance is: "+this.CheckingBalance);
        }

    }
    public void WithdrawSaving(double balance){
        if(balance>this.SavingBalance){
            System.out.println("Not enough money to withdraw");
        }else{
            this.SavingBalance -= balance;
            TotalBalance +=balance;
            System.out.println("Withdraw Successfully, your current Saving account balance is: "+this.SavingBalance);
        }

    }
}
