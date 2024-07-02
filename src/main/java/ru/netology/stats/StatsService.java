package ru.netology.stats;


public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public long averageSalesPerMonth(long[] sales) {
        long allSales = sumOfAllSales(sales);
        return allSales / 12;
    }

    public int monthNumberPeakSales(long[] sales) {
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int monthNumberMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsOfSalesBelowAverage(long[] sales) {
        long belowAverage = averageSalesPerMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < belowAverage) {
                counter = counter + 1;
            }

        }
        return counter;

    }

    public int monthSalesAboveAverage(long[] sales) {
        long aboveAverage = averageSalesPerMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > aboveAverage) {
                counter = counter + 1;
            }

        }
        return counter;
    }
}
