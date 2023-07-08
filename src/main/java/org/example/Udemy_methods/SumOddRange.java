package org.example.Udemy_methods;

public class SumOddRange {

    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0 ? true : false);

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start <= 0 || end <= 0 || start > end) {
            return -1;}

            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            }
            return sum;
        }

        public static void main (String[]args){

            System.out.println(sumOdd(200,100));

        }
    }

