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
    public static String Fibonacci(int number) {
        int n1 = 0, n2 = 1, n3, i;
        StringBuilder a = new StringBuilder(n1 + "," + n2);

        for (i = 2; i < number; ++i) {
            n3 = n1 + n2;
            a.append(",").append(n3);
            n1 = n2;
            n2 = n3;
        }

        return a.toString();
    }

    //Factorial
    public static String Factorial(int number) {
        String a;
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        a = "Factorial of " + number + " is : " + fact;

        return a;
    }

    //Factorial
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

    public static String checkArmstrong(int number) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            if (Armstrong(i)) {
                a.append(i).append(", ");
            }
        }
        return a.substring(0, a.length() - 2);
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

    //to Check the given number is sunny or not
    public static String Sunny(int number) {
        String a;
        if (findSquare(number + 1)) {
            a = number + " is a sunny number.";
        }
//executes if N+1 is not a perfect square
        else {
            a = number + " is not a sunny number.";
        }
        return a;
    }

    public static String Punctuation(String string) {
        int count = 0;
        String a;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '!' || string.charAt(i) == ',' || string.charAt(i) == ';' || string.charAt(i) == '.' || string.charAt(i) == '?' || string.charAt(i) == '-' ||
                    string.charAt(i) == '\'' || string.charAt(i) == '\"' || string.charAt(i) == ':') {
                count++;
            }
        }
        a = "The number of punctuations exists in the given string is: " + count;
        return a;
    }
    public static String Vowels(String string) {
        int vCount = 0;
        String a;
        //Converting entire string to lower case to reduce the comparisons
        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
        }
        a = "Number of vowels: " + vCount;
        return a;
    }

    public static String Consonants(String string) {
        int cCount = 0;
        String a;
        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                //Increments the vowel counter
            }
            //Checks whether a character is a consonant
            else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        a = "Number of consonants: " + cCount;
        return a;
    }

    public static String Anagram(String string1,String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        String a;
        if (string1.length() != string2.length()) {
            a = "Both the strings are not anagram";
        }
        else {
            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            if(Arrays.equals(str1, str2)) {
                a = "Both the strings are anagram";
            }
            else {
                a = "Both the strings are not anagram";
            }
        }
        return a;
    }

    public static String AutomorphicRange(int start, int end){
        StringBuilder a = new StringBuilder();
        for(int i=start; i<=end; i++)
        {
            if(Automorphic(i))
                a.append(i+" ");
        }

        return a.toString();

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

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vCount++;
            }
        }
        return vCount;
    }

    public static int ConsonantsNumber(String string) {
        int cCount = 0;

        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                //Increments the vowel counter
            }
            //Checks whether a character is a consonant
            else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        return cCount;
    }


    //integers end


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
        if (number == lastDigit)
            return true;
        else
            return false;
    }
    //float end
}
