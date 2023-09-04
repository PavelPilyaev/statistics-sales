package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void totalOfAllSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.totalOfAllSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void averageSalesAmount() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthNumberMaxSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.monthNumberMaxSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void monthNumberMinSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.monthNumberMinSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsSalesAboveAverage() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.numberOfMonthsSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsSalesBelowAverage() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.numberOfMonthsSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}





