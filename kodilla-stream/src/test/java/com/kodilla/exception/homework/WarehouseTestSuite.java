package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testDoesOrderExist() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0001"));
        // when
        String orderResult = warehouse.getOrder("0001").getNumber();
        // then
        assertEquals(orderResult, "0001");
    }


    @Test
    public void testDoesOrderExist_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        // when

        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0001"));
    }
}