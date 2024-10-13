package com.kodilla.bank.homework;

public class Bank {

    public CashMachine[] bank;

    public int size;

    public Bank() {

        this.bank = new CashMachine[10];

    }

    public void addAtm(CashMachine bankInstance) {
        bank[size] = bankInstance;
        size++;
    }

    public int getTotalBalance() {
        int totalBalance = 0;

        for (int i = 0; i < size; i++) {
            totalBalance = bank[i].getBalance() + totalBalance;
        }
        return totalBalance;
    }

    public int getTotalPaymentNumber() {
        int totalPaymentNumber = 0;
        for (int j = 0; j < size; j++) {
            totalPaymentNumber = totalPaymentNumber + bank[j].getPaymentNumber();
        }
        return totalPaymentNumber;
    }

    public int getTotalPaycheckNumber() {
        int totalPaycheckNumber = 0;
        for (int j = 0; j < size; j++) {
            totalPaycheckNumber = totalPaycheckNumber + bank[j].getPaycheckNumber();
        }
        return totalPaycheckNumber;
    }

    public double getTotalPaymentAvg() {
        double avgPaymentSum = 0;
        int atmsWithPayments = 0;
        double totalPaymentAvg;
        for (int j = 0; j < size; j++) {
            avgPaymentSum = avgPaymentSum + bank[j].getPaymentAvg();
        }
        for (int i = 0; i < size; i++) {
            if (bank[i].getPaymentAvg() > 0) {
                atmsWithPayments = atmsWithPayments + 1;
            }
        }
        totalPaymentAvg = avgPaymentSum / atmsWithPayments;

        return totalPaymentAvg;
    }

    public double getTotalPaycheckAvg() {
        double avgPaycheckSum = 0;
        int atmsWithPaychecks = 0;
        double totalPaycheckAvg;
        for (int j = 0; j < size; j++) {
            avgPaycheckSum = avgPaycheckSum + bank[j].getPaycheckAvg();
        }
        for (int i = 0; i < size; i++) {
            if (bank[i].getPaycheckAvg() < 0) {
                atmsWithPaychecks = atmsWithPaychecks + 1;
            }
        }
        totalPaycheckAvg = avgPaycheckSum / atmsWithPaychecks;

        return totalPaycheckAvg;
    }
}





