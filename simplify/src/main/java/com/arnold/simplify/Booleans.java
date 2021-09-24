package com.arnold.simplify;

public class Booleans {
    public static Boolean Armstrong(int number) {
        int temp, digits = 0, last, sum = 0;
        temp = number;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = number;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        return number == sum;
    }

    //booleans
    //checking whether the given string isPalindrome or not
    public static boolean isPalindrome(String string) {

        int i = 0, j = string.length() - 1;

        while (i < j) {

            if (string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }


    //to Check the given number is sunny or not
    private static boolean findSquare(double number) {
        double square_root = Math.sqrt(number);
        return ((square_root - Math.floor(square_root)) == 0);
    }

    public static Boolean Automorphic(int number) {
        int count = 0;
        String a;
        int square = number * number;
        int temp = number;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int lastDigit = (int) (square % (Math.pow(10, count)));
        return number == lastDigit;
    }
}
