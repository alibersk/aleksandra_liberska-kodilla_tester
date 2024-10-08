package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();

        int[] transactions = cashMachine.getTransactions();

        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldHaveZeroBalance() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.getBalance();

        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldAddTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(20);
        cashMachine.add(60);
        cashMachine.add(-50);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(20, transactions[0]);
        assertEquals(60, transactions[1]);
        assertEquals(-50, transactions[2]);
    }

    @Test
    public void shouldHaveProperBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(20);
        cashMachine.add(60);
        cashMachine.add(-50);
        cashMachine.add(0);

        cashMachine.getBalance();

        assertEquals(30, cashMachine.getBalance());
    }

    @Test
    public void shouldHaveProperPaymentAndPaycheckNumber() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(20);
        cashMachine.add(60);
        cashMachine.add(-50);
        cashMachine.add(0);

        cashMachine.getPaymentNumber();
        cashMachine.getPaycheckNumber();

        assertEquals(2, cashMachine.getPaymentNumber());
        assertEquals(1, cashMachine.getPaycheckNumber());
    }

    @Test
    public void shouldHaveProperPaymentAndPaycheckSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(20);
        cashMachine.add(60);
        cashMachine.add(-50);
        cashMachine.add(0);

        cashMachine.getPaymentSum();
        cashMachine.getPaycheckSum();

        assertEquals(80, cashMachine.getPaymentSum());
        assertEquals(-50, cashMachine.getPaycheckSum());
    }

    @Test
    public void shouldAddTransactionsForManyAtms() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(20);
        cashMachine1.add(60);
        cashMachine1.add(-50);
        cashMachine2.add(40);
        cashMachine2.add(10);
        cashMachine2.add(-60);
        cashMachine2.add(-10);

        int[] transactions1 = cashMachine1.getTransactions();
        int[] transactions2 = cashMachine2.getTransactions();

        assertEquals(3, transactions1.length);
        assertEquals(20, transactions1[0]);
        assertEquals(60, transactions1[1]);
        assertEquals(-50, transactions1[2]);
        assertEquals(4, transactions2.length);
        assertEquals(40, transactions2[0]);
        assertEquals(10, transactions2[1]);
        assertEquals(-60, transactions2[2]);
        assertEquals(-10, transactions2[3]);

        cashMachine1.getPaymentNumber();
        cashMachine1.getPaycheckNumber();
        cashMachine2.getPaymentNumber();
        cashMachine2.getPaycheckNumber();

        assertEquals(2, cashMachine1.getPaymentNumber());
        assertEquals(1, cashMachine1.getPaycheckNumber());
        assertEquals(2, cashMachine2.getPaymentNumber());
        assertEquals(2, cashMachine2.getPaycheckNumber());

        cashMachine1.getBalance();
        cashMachine2.getBalance();

        assertEquals(30, cashMachine1.getBalance());
        assertEquals(-20, cashMachine2.getBalance());
    }

}
