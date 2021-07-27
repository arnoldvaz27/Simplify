package com.arnold.simplify;

import java.util.Arrays;

public class Primitives {
    //string start
    //reversing the string
    public static String reverse(String string) {

        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }

    //converting string to ascii
    public static String normalAscii(String string) {
        byte[] strAsByteArray = string.getBytes();
        return Arrays.toString(strAsByteArray);
    }

    //converting string to reverse string and then to ascii
    public static String reverseAscii(String string) {
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return Arrays.toString(result);
    }

    public static String sentenceToArray(String string) {
        String[] words = string.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return Arrays.toString(words);
    }

    //converting string to title case, capitalizing each starting character
    public static String toTitleCase(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder converted = new StringBuilder();

        boolean convertNext = true;
        for (char ch : text.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }

        return converted.toString();
    }

    //toggling each character of the string
    public static String toToggleCase(String string) {
        char[] str = string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z')
                str[i] = (char) (str[i] + 'a' - 'A');
            else if (str[i] >= 'a' && str[i] <= 'z')
                str[i] = (char) (str[i] + 'A' - 'a');
        }

        return new String(str);
    }

    //Fibonacci series
    public static String Fibonacci(int count) {
        int n1 = 0, n2 = 1, n3, i;
        StringBuilder a = new StringBuilder(n1 + "," + n2);

        for (i = 2; i < count; ++i)
        {
            n3 = n1 + n2;
            a.append(",").append(n3);
            n1 = n2;
            n2 = n3;
        }

        return a.toString();
    }

    //Factorial
    public static String Factorial(int count) {
        String a;
        int i, fact = 1;
        for (i = 1; i <= count; i++) {
            fact = fact * i;
        }
        a = "Factorial of " + count + " is : " + fact;

        return a;
    }

    //Factorial
    public static Boolean Armstrong(int count) {
        int temp, digits = 0, last, sum = 0;
        temp = count;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = count;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        return count == sum;
    }

    public static String checkArmstrong(int number) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i <= number; i++){
            if (Armstrong(i)){
                a.append(i).append(", ");
            }
        }
        return a.substring(0,a.length()-2);
    }


    //check Prime Number
    public static String checkPrimeNumber(int number) {
        int i, m, flag = 0;
        m = number / 2;
        String a = null;
        if (number == 0 || number == 1) {
            a = number + " is not prime number";
        } else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    a = number + " is not prime number";
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                a = number + " is prime number";
            }
        }
        return a;
    }
    //strings end

    //integers start
    //counting the word in a given string or sentence
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
    //integers end

    //booleans
    //checking whether the given string isPalindrome or not
    public static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
    //booleans end

    // float
    //converting
    public static float FahrenheitToCentigrade(float value) {
        float ceh;
        ceh = (value - 32) / 1.8f;
        return ceh;
    }

    public static float CentigradeToFahrenheit(float value) {
        float fah;
        fah = (1.8f * value) + 32;
        return fah;
    }
    //float end
}
