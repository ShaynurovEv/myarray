package ru.netology.stats;

public class SalesService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int averageSum = sumAllSales(sales);
        int total = averageSum / 12;
        return total;
    }

    public int maxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int maxMonthSale(int[] sales) {
        int maxMonth = 0;
        int middle = averageSum(sales);
        for (int sale : sales) {
            if (sale > middle) {
                maxMonth = maxMonth + 1;
            }
        }
        return maxMonth;
    }

    public int minMonthSale(int[] sales) {
        int minMonth = 0;
        int middle = averageSum(sales);
        for (int sale : sales) {
            if (sale > middle) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }
}
