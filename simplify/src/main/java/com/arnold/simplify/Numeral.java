package com.arnold.simplify;

public class Numeral {
    //string start
    public static String maxOccurredCharacter(String string) {

        int[] freq = new int[string.length()];
        char maxChar = string.charAt(0);
        int i, j, max;

        char[] string2 = string.toCharArray();

        for(i = 0; i < string2.length; i++) {
            freq[i] = 1;
            for(j = i+1; j < string2.length; j++) {
                if(string2[i] == string2[j] && string2[i] != ' ' && string2[i] != '0') {
                    freq[i]++;

                    string2[j] = '0';
                }
            }
        }

        max = freq[0];
        for(i = 0; i <freq.length; i++) {


            if(max < freq[i]) {
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

        for(i = 0; i < string2.length; i++) {
            freq[i] = 1;
            for(j = i+1; j < string2.length; j++) {
                if(string2[i] == string2[j] && string2[i] != ' ' && string2[i] != '0') {
                    freq[i]++;

                    string2[j] = '0';
                }
            }
        }

        min = freq[0];
        for(i = 0; i <freq.length; i++) {

            if(min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = string2[i];
            }
        }
        return String.valueOf(minChar);
    }

    public static String smallestWord(String string){
        StringBuilder word = new StringBuilder();
        String small = "";
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != ' '){
                word.append(string.charAt(i));
            }
            else{
                words[length] = word.toString();
                length++;
                word = new StringBuilder();
            }
        }
        small = words[0];

        for(int k = 0; k < length; k++){

            if(small.length() > words[k].length())
                small = words[k];

        }
        return small;
    }

    public static String largestWord(String string){
        StringBuilder word = new StringBuilder();
        String large="";
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != ' '){
                word.append(string.charAt(i));
            }
            else{
                words[length] = word.toString();
                length++;
                word = new StringBuilder();
            }
        }
        large = words[0];

        for(int k = 0; k < length; k++){

            if(large.length() < words[k].length())
                large = words[k];
        }
        return large;
    }
}
