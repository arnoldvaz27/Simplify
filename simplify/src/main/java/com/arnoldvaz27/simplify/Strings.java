package com.arnoldvaz27.simplify;

import static com.arnoldvaz27.simplify.Booleans.armstrong;
import static com.arnoldvaz27.simplify.Booleans.automorphic;

import java.util.Arrays;

public class Strings {
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
    public static String fibonacci(int number) {
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
    public static String factorial(int number) {
        String a;
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        a = "Factorial of " + number + " is : " + fact;

        return a;
    }

    public static String maxOccurredCharacter(String string) {

        int[] freq = new int[string.length()];
        char maxChar = string.charAt(0);
        int i, j, max;

        char[] string2 = string.toCharArray();

        for (i = 0; i < string2.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < string2.length; j++) {
                if (string2[i] == string2[j] && string2[i] != ' ' && string2[i] != '0') {
                    freq[i]++;

                    string2[j] = '0';
                }
            }
        }

        max = freq[0];
        for (i = 0; i < freq.length; i++) {


            if (max < freq[i]) {
                max = freq[i];
                maxChar = string2[i];
            }
        }
        return String.valueOf(maxChar);
    }

    public static String minOccurredCharacter(String string) {

        int[] freq = new int[string.length()];
        char minChar = string.charAt(0);
        int i, j, min;

        char[] string2 = string.toCharArray();

        for (i = 0; i < string2.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < string2.length; j++) {
                if (string2[i] == string2[j] && string2[i] != ' ' && string2[i] != '0') {
                    freq[i]++;

                    string2[j] = '0';
                }
            }
        }

        min = freq[0];
        for (i = 0; i < freq.length; i++) {

            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = string2[i];
            }
        }
        return String.valueOf(minChar);
    }

    public static String smallestWord(String string) {
        StringBuilder word = new StringBuilder();
        String small;
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word.append(string.charAt(i));
            } else {
                words[length] = word.toString();
                length++;
                word = new StringBuilder();
            }
        }
        small = words[0];

        for (int k = 0; k < length; k++) {

            if (small.length() > words[k].length())
                small = words[k];

        }
        return small;
    }

    public static String largestWord(String string) {
        StringBuilder word = new StringBuilder();
        String large;
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word.append(string.charAt(i));
            } else {
                words[length] = word.toString();
                length++;
                word = new StringBuilder();
            }
        }
        large = words[0];

        for (int k = 0; k < length; k++) {

            if (large.length() < words[k].length())
                large = words[k];
        }
        return large;
    }

    public static String checkArmstrong(int number) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            if (armstrong(i)) {
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
    public static String sunny(int number) {
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

    public static String punctuation(String string) {
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

    public static String vowels(String string) {
        int vCount = 0;
        String a;
        //Converting entire string to lower case to reduce the comparisons
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
        }
        a = "Number of vowels: " + vCount;
        return a;
    }

    public static String consonants(String string) {
        int cCount = 0;
        String a;
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
        a = "Number of consonants: " + cCount;
        return a;
    }

    public static String anagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        String a;
        if (string1.length() != string2.length()) {
            a = "Both the strings are not anagram";
        } else {
            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2)) {
                a = "Both the strings are anagram";
            } else {
                a = "Both the strings are not anagram";
            }
        }
        return a;
    }

    public static String automorphicRange(int start, int end) {
        StringBuilder a = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (automorphic(i))
                a.append(i).append(" ");
        }

        return a.toString();

    }

    private static boolean findSquare(double number) {
        double square_root = Math.sqrt(number);
        return ((square_root - Math.floor(square_root)) == 0);
    }

}
