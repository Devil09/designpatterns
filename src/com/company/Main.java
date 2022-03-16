package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //String str = "rock";
        //String str2 = "nihcas";

        //System.out.println(reverseManually(str));

        String str1 = "abbagzgllmmnuugyhvbjhbjh";
        System.out.println(checkFirstNonRepeatedChar(str1));
    }

    public static String reverseStringWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number.");
            }
        }
    }


    //sachin
    public static String reverseManually(String str) {
        StringBuilder s = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            s.append(str.charAt(i));
        }

        return s.toString();
    }

    //Java anagram program
    //Take 2 string as input
    //convert 2 strings to charatcted array
    //sort 2 string arrays using array.sort
    //compare 2 string array if they are equal or not

    public static String anagramChecker(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        String s;

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            s = "Anagram";
        } else {
            s = "Not Anagram";
        }

        return s;
    }

    //Check if all the characters are unique iin a string or not
    public static boolean checkIfAllCharAreUnique(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean charCheck[] = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charCheck[val]) {
                return false;
            }

            charCheck[val] = true;
        }

        return true;

    }

    public static boolean checkIfStringIsRotational(String str) {
        String orginalString = "sachin";
        String keyString = "achins";
        boolean rotational = false;

        //Concatinate orginal String
        String concatinatedString = orginalString + orginalString;

        if (concatinatedString.contains(keyString)) {
            rotational = true;
        } else {
            rotational = false;
        }


        return rotational;

    }

    //check for duplicated characters in a string
    public static String checkDuplicatedChars(String str1) {
        String currentchars = "";
        String duplicates = "";

        for (int i = 0; i < str1.length(); i++) {
            String chara = String.valueOf(str1.charAt(i));//Character.toString(str1.charAt(i));
            if (currentchars.contains(chara)) {
                if (!duplicates.contains(chara)) {
                    duplicates = duplicates.concat(chara);
                }
            }
            currentchars = currentchars.concat(chara);
        }

        return duplicates;
    }


    //find first non repeated character in java
    public static String checkFirstNonRepeatedChar(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String nonRepeatedChar = "";

        for (int j = 0; j < s.length(); j++) {
            String currentCharacter = String.valueOf(s.charAt(j));

            if (hashMap.containsKey(currentCharacter) == false) {
                hashMap.put(String.valueOf(s.charAt(j)), 1);
            } else {
                int currentfreq = Integer.valueOf(hashMap.get(String.valueOf(s.charAt(j))));
                currentfreq++;
                hashMap.put(currentCharacter, currentfreq);
            }

        }

        for (int k = 0; k < s.length(); k++) {
            int currentCharacterFreq = 0;

            currentCharacterFreq = hashMap.get(String.valueOf(s.charAt(k)));

            if (currentCharacterFreq == 1) {
                nonRepeatedChar = String.valueOf(s.charAt(k));
                break;
            }

        }

        return nonRepeatedChar;
    }

    //find lenght of a string without any in built method
    private static int getLenghtOfString(String s) {
        int counter = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            counter++;
        }

        return counter;

    }

    //substring of a string
    private static void subString(char str[], int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }

                System.out.println();
            }
        }
    }
}
