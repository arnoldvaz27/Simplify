package com.arnold.simplify;

import java.util.Arrays;

public class Primitives {
    //string start
    //reversing the string
    public static String reverse(String string){

        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);

    }

    //converting string to ascii
    public static String normalAscii(String string){
        byte[] strAsByteArray = string.getBytes();
        return Arrays.toString(strAsByteArray);
    }

    //converting string to reverse string and then to ascii
    public static String reverseAscii(String string){
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return Arrays.toString(result);
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
    public static String toToggleCase(String string)
    {
        char[] str = string.toCharArray();
        for (int i=0; i<str.length; i++)
        {
            if (str[i]>='A' && str[i]<='Z')
                str[i] = (char) (str[i] + 'a' - 'A');
            else if (str[i]>='a' && str[i]<='z')
                str[i] = (char) (str[i] + 'A' - 'a');
        }

        return new String(str);
    }
    //strings end

    //integers start

    //counting the word in a given string or sentence
    public static int wordCounter(String string){
        String[] words = string.split("\\s");
        return words.length;
    }

    //adding the string value and returning its sum
    public static int addAscii(String string){
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];
        int a = 0;

        for (int i = 0; i < strAsByteArray.length; i++)
        {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            a += result[i];
        }
        return a;
    }


    //adding the string value and returning its subtract value
    public static int subtractAscii(String string){
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];
        int a = 0;

        for (int i = 0; i < strAsByteArray.length; i++)
        {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            a -= result[i];
        }
        return a;
    }
    //integers end


    //booleans

    //checking whether the given string isPalindrome or not
    public static boolean isPalindrome(String str)
    {

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
}
