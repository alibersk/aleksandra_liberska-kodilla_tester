package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldGetTotalBalance() {
        //given
        CashMachine c1 = new CashMachine();
        c1.add(30);
        c1.add(-20);
        CashMachine c2 = new CashMachine();
        c2.add(-20);
        c2.add(40);
        c2.add(0);
        Bank bank = new Bank();
        bank.addAtm(c1);
        bank.addAtm(c2);

        //when
        int result = bank.getTotalBalance();

        //then
        Assertions.assertEquals(30, result);
    }
    @Test
    public void shouldGetTotalOPaymentNumber() {
        //given
        CashMachine c1 = new CashMachine();
        c1.add(30);
        c1.add(-20);
        CashMachine c2 = new CashMachine();
        c2.add(-20);
        c2.add(40);
        c2.add(0);
        Bank bank = new Bank();
        bank.addAtm(c1);
        bank.addAtm(c2);

        //when
        int result = bank.getTotalPaymentNumber();

        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldGetTotalPaycheckNumber() {
        //given
        CashMachine c1 = new CashMachine();
        c1.add(30);
        c1.add(-20);
        CashMachine c2 = new CashMachine();
        c2.add(-20);
        c2.add(40);
        c2.add(0);
        Bank bank = new Bank();
        bank.addAtm(c1);
        bank.addAtm(c2);

        //when
        int result = bank.getTotalPaycheckNumber();

        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldGetAveragePayment() {
        //given
        CashMachine c1 = new CashMachine(); //av 30
        c1.add(30);
        c1.add(-20);
        CashMachine c2 = new CashMachine(); //av 30
        c2.add(-20);
        c2.add(40);
        c2.add(20);
        c2.add(0);
        CashMachine c3 = new CashMachine(); // av 60
        c3.add(-30);
        c3.add(60);
        c3.add(-10);
        c3.add(20);
        c3.add(100);
        CashMachine c4 = new CashMachine(); // no av
        c4.add(-50);
        Bank bank = new Bank();
        bank.addAtm(c1);
        bank.addAtm(c2);
        bank.addAtm(c3);
        bank.addAtm(c4);

        //when
        double result = bank.getTotalPaymentAvg();

        //then
        Assertions.assertEquals(40, result);
    }

    @Test
    public void shouldGetAveragePaycheck() {
        //given
        CashMachine c1 = new CashMachine(); // av -20
        c1.add(30);
        c1.add(30);
        c1.add(-20);
        c1.add(-20);
        CashMachine c2 = new CashMachine(); // av -30
        c2.add(-20);
        c2.add(-40);
        c2.add(40);
        c2.add(20);
        c2.add(0);
        CashMachine c3 = new CashMachine(); // av -40
        c3.add(-30);
        c3.add(50);
        c3.add(-50);
        CashMachine c4 = new CashMachine(); // no av
        c4.add(40);
        Bank bank = new Bank();
        bank.addAtm(c1);
        bank.addAtm(c2);
        bank.addAtm(c3);
        bank.addAtm(c4);

        //when
        double result = bank.getTotalPaycheckAvg();

        //then
        Assertions.assertEquals(-30, result);
    }

}
