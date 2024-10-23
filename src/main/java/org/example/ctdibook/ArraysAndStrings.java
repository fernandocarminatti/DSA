package org.example.ctdibook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraysAndStrings {
    public static boolean isUnique(String str){
        // ASCII -> 128 chars. Limited Special Chars, no emojis.
        // Unicode -> 65,536 chars. Multiple languages, special chars, emojis.

        HashSet<Character> charSeen = new HashSet<>();

        for(char c: str.toCharArray()){
            if( !charSeen.add(c) ) {
                return false;
            }
        }
        return true;
    }

    public static boolean permutation(String str1, String str2){
        // Uses sorting so that we can compare the strings. O(n log n)

        if(str1.length() != str2.length()){
            return false;
        }
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);

        return Arrays.equals(sortedStr1, sortedStr2);
    }

    public static boolean permutationButBetter(String str1, String str2){
        // Since we are using hashMap, space complexity is O(1) and time complexity is O(n)

        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> charChecker = new HashMap<>();

        for(char c: str1.toCharArray()){
            if(charChecker.containsKey(c)){
                charChecker.put(c, charChecker.get(c) + 1);
            }
            charChecker.put(c, 1);
        }

        for(char c: str2.toCharArray()){
            if( !charChecker.containsKey(c) ){
                return false;
            }
            charChecker.put(c, charChecker.get(c) - 1);

            if(charChecker.get(c) < 0){
                return false;
            }
        }
        return true;
    }

    public static String urlify(String str){
        return str.replaceAll("\\s", "%20");
    }

    public static String compression(String str) {
        StringBuilder compressedStr = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressedStr.append(str.charAt(i));
                compressedStr.append(count);
                count = 0;
            }
        }
        return compressedStr.toString();
    }
}
