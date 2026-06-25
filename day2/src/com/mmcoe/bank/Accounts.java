package com.mmcoe.bank;

public class Accounts {
    private double balance;
    private double overdraft;

    public Accounts() {
        balance = 0;
        overdraft = 10000;
    }

    public Accounts(double balance) {
        this.balance = balance;
        overdraft = 10000;
    }

    public void deposit(double amount) {
        overdraft+=amount;
        if(overdraft > 10000) {
        	balance += overdraft - 10000;
        	overdraft = 10000;
        }
    }

    public void withdraw(double amount) throws BalanceException {
        if (amount <= balance) {
            balance -= amount;
        } else if (amount <= balance + overdraft) {
            overdraft -= (amount - balance);
            balance = 0;
        } 
        else {
        	throw new BalanceException("Insufficient Balance");
        }
   }

    @Override
    public String toString() {
        return "Accounts [balance=" + balance +
               ", overdraft=" + overdraft + "]";
    }
}