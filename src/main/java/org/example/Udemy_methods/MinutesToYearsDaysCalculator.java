package org.example.Udemy_methods;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(54000);
    }

    public static void printYearsAndDays (long minutes) {
        long YY = minutes / 525600;
        long ZZ = (minutes % 525600) / 1440;
            if (minutes < 0)
                System.out.println("Invalid Value");
            else System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d");
    }
}
