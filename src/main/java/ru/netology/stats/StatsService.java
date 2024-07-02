package ru.netology.stats;


public class StatsService {

    public long SumOfAllSales(long[] sales) {
        long AllSales = 0;
        for (long sale : sales) {
            AllSales += sale;
        }
        return AllSales;
    }

    public long AverageSalesPerMonth(long[] sales) {
        long AllSales = SumOfAllSales(sales);
        return AllSales / 12;
    }

    public int MonthNumberPeakSales(long[] sales) {
        int PeakMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] >= sales[PeakMonth]) {
                PeakMonth = i;
            }
        }
        return PeakMonth + 1;
    }

    public int MonthNumberMinSales(long[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public int MonthsOfSalesBelowAverage(long[] sales) {
        long BelowAverage = AverageSalesPerMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < BelowAverage) {
                counter = counter + 1;
            }

        }
        return counter;

    }

    public int MonthSalesAboveAverage(long[] sales) {
        long AboveAverage = AverageSalesPerMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < AboveAverage) {
                counter = counter + 1;
            }

        }
        return counter;
    }
}
