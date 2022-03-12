package com.chitransh.string_operations;

public class FindLongestPalindrom {

    public static void main(String args[]){
        String s1 = "aabcdddcdddcabasdfawmklcdawfdnwaflkcwakdsdcdaldkc";
        System.out.println(findLongestSubstring(s1));
    }

    static String findLongestSubstring(String s){
        String result = "";

        for(int i=3; i< s.length(); i+=2){
            for(int j=0; j< s.length()-i-1; j++){
                String tempString = s.substring(j, i+j);
                if(isPalindrome(tempString) && (tempString.length() >= result.length())) result = tempString;
            }
        }

        return result;
    }

    static boolean isPalindrome(String s){
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
