package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int totalOfAllSales(int[] sales) {

        int totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }

        return totalSales;

    }

    public int averageSalesAmount(int[] sales) {

        int averageSales = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSales += sales[i];
        }
        return (averageSales / sales.length);

    }

    public int monthNumberMaxSales(int[] sales) {

        int maxMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSales]) {
                maxMonthSales = i;
            }
        }
        return maxMonthSales + 1;
    }

    public int monthNumberMinSales(int[] sales) {

        int minMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSales]) {
                minMonthSales = i;
            }
        }
        return minMonthSales + 1;
    }

    public int numberOfMonthsSalesAboveAverage(int[] sales) {

        int minSales = averageSalesAmount(sales);
        int min = 0;

        for (int i = 0; i < sales.length; i++) {
            if (minSales > sales[i]) {
                min++;
            }
        }
        return min;
    }

    public int numberOfMonthsSalesBelowAverage(int[] sales) {

        int maxSales = averageSalesAmount(sales);
        int max = 0;

        for (int i = 0; i < sales.length; i++) {
            if (maxSales < sales[i]) {
                max++;
            }
        }
        return max;
    }

}






