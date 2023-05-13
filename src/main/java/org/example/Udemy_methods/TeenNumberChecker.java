package org.example.Udemy_methods;

public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(isTeen(15));

    }

    public static boolean hasTeen (int x, int y, int z) {
        return isTeen(x) || isTeen(y) || isTeen(z);
    }

    public static boolean isTeen (int num) {
        return num >= 13 && num <= 19;
    }
}
