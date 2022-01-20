package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSales(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int calculateAboveAverage(long[] sales) {
        long month = 0;
        for (long sale : sales) {

            if (sale > calculateAverageSales(sales)) {
                month = month + 1;
            }
        }
        return (int) month;
    }

    public int calculateBelowAverage(long[] sales) {
        long month = 0;
        for (long sale : sales) {

            if (sale < calculateAverageSales(sales)) {
                month = month + 1;
            }
        }
        return (int) month;
    }


}



