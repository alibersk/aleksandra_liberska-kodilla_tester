package com.kodilla.bank.homework;

public class CashMachine {
    int[] transactions;
    private int size = 0;
    int balance;
    int paycheckNumber;
    int paymentSum;
    int paycheckSum;

    public CashMachine() {

        this.size = 0;
        this.transactions = new int[0];
        this.balance = 0;
        this.paycheckNumber = 0;
        this.paymentSum = 0;
        this.paycheckSum = 0;
    }

    public void add(int transactionAmount) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transactionAmount;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int balance = 0;

        for (int i = 0; i < transactions.length; i++ ) {
            balance = transactions[i] + balance;
        }
        return balance;
    }

    public int getPaymentNumber(){
        int paymentNumber = 0;
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] > 0) {
                paymentNumber = paymentNumber + 1;
            }
        }
        return paymentNumber;
    }

    public int getPaycheckNumber(){
        int paycheckNumber = 0;
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] < 0) {
                paycheckNumber = paycheckNumber + 1;
            }
        }
        return paycheckNumber;
    }

    public int getPaymentSum(){
        int paymentSum = 0;
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] > 0) {
                paymentSum = paymentSum + transactions[i];
            }
        }
        return paymentSum;
    }

    public int getPaycheckSum(){
        int paycheckSum = 0;
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] < 0) {
                paycheckSum = paycheckSum + transactions[i];
            }
        }
        return paycheckSum;
    }

    public double getPaymentAvg() {
        double paymentAvg = 0;
        int paymentSum = 0;
        int paymentNumber = 0;
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] > 0) {
                paymentNumber = paymentNumber + 1;
            }
        }
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] > 0) {
                paymentSum = paymentSum + transactions[i];
                paymentAvg = (double) paymentSum / paymentNumber;
            }
        }
        return paymentAvg;
    }

    public double getPaycheckAvg() {
        double paycheckAvg = 0;
        int paycheckSum = 0;
        int paycheckNumber = 0;
        for (int i = 0; i < transactions.length; i++ ) {
            if (transactions[i] < 0) {
                paycheckNumber = paycheckNumber + 1;
            }
        }
        for (int j = 0; j < transactions.length; j++ ) {
            if (transactions[j] < 0) {
                paycheckSum = paycheckSum + transactions[j];
                paycheckAvg = (double) paycheckSum / paycheckNumber;
        }
    }
        return paycheckAvg;
    }

}
