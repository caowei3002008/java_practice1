package com.wei.BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(0,0);
        BankAccount b2 = new BankAccount(0,0);
        BankAccount b3 = new BankAccount(0,0);
        BankAccount b4 = new BankAccount(0,0);
        BankAccount b5 = new BankAccount(0,0);
        BankAccount b6 = new BankAccount(0,0);
        BankAccount b7 = new BankAccount(0,0);
        BankAccount b8 = new BankAccount(0,0);
        BankAccount b9 = new BankAccount(0,0);
        BankAccount b10 = new BankAccount(0,0);

        System.out.println(b1.getAccountNumber());
        System.out.println(b2.getAccountNumber());
        System.out.println(b3.getAccountNumber());
        System.out.println(b4.getAccountNumber());
        System.out.println(b5.getAccountNumber());
        System.out.println(b6.getAccountNumber());
        System.out.println(b7.getAccountNumber());
        System.out.println(b8.getAccountNumber());
        System.out.println(b9.getAccountNumber());
        System.out.println(b10.getAccountNumber());

        System.out.println(b1.getCountsOfAccount());
        b1.depositIntoChecking(5000);
        b2.depositIntoSaving(20000);
        b3.depositIntoChecking(10000);
        b4.WithdrawlChecking(20000);
        b1.WithdrawlChecking(2000);
        System.out.println(b1.getTotalBalance());

    }
}
