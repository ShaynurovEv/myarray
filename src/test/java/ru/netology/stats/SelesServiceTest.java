package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelesServiceTest {
    @Test
    public void minSaleMonth() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumAllSales() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumAllSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSum() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSum(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSaleMonth() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSumSale() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.maxMonthSale(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSumSale() {
        SalesService service = new SalesService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.minMonthSale(sale);
        Assertions.assertEquals(expected, actual);
    }
}
