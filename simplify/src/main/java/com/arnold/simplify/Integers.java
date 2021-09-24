package com.arnold.simplify;

public class Integers {
    public static int wordCounter(String string) {
        String[] words = string.split("\\s");
        return words.length;
    }

    //adding the string value and returning its sum
    public static int addAscii(String string) {
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];
        int a = 0;

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            a += result[i];
        }
        return a;
    }

    //adding the string value and returning its subtract value
    public static int subtractAscii(String string) {
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];
        int a = 0;

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            a -= result[i];
        }
        return a;
    }

    //reversing the given number
    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    //sum of arrays of the given numbers of arrays
    public static int sumOfArray(int[] number) {
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int j : number) {
            sum = sum + j;
        }
        return sum;
    }

    //Factorial
    public static int factorialNumber(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int VowelsNumber(String string) {
        int vCount = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vCount++;
            }
        }
        return vCount;
    }

    public static int ConsonantsNumber(String string) {
        int cCount = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                //Increments the vowel counter
            }
            //Checks whether a character is a consonant
            else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        return cCount;
    }
}
