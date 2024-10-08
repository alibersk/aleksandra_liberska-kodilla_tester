package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] bank;
    public int length;
    public int size;
    public int totalPaymentNumber;
    public int totalPaycheckNumber;
    public int totalPaymentSum;
    public int totalPaycheckSum;
    public int totalBalance;


public Bank(){

    this.bank = new CashMachine[0];
    this.length = 0;
    this.totalPaymentNumber = 0;
    this.totalPaycheckNumber = 0;
    this.totalPaymentSum = 0;
    this.totalPaycheckSum = 0;
    this.totalBalance = 0;
}


//    public void addAtm(CashMachine bankInstance) {
//        this.size++;
//        CashMachine[] newTab = new CashMachine[this.size];
//        System.arraycopy(bank, 0, newTab, 0, bank.length);
//        newTab[this.size - 1] = bankInstance;
//        this.bank = newTab;
//    }

    public int getTotalPaymentNumber() {
        int totalPaymentNumber = 0;
        for (int j = 0; j < bank.length; j++) {
            totalPaymentNumber = totalPaymentNumber + bank[j].paymentNumber;
        }
        return totalPaymentNumber;
    }
}





