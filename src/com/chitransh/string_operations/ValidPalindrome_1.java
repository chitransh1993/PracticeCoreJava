package com.chitransh.string_operations;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.
//
//
//        Constraints:
//
//        1 <= s.length <= 2 * 105
//        s consists only of printable ASCII characters.
public class ValidPalindrome_1 {
        public static boolean isPalindrome(String s) {

            String palinString = "";

            for(int i=0; i<s.length();i++){

                char c = s.charAt(i);
                if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) palinString+= String.valueOf(c);


            }

            return checkPalindrome(palinString.toLowerCase());
        }

        public static boolean checkPalindrome(String s){

            if(s.equals("")) return true;
            if(s.length() == 1) return false;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
            }

            return true;
        }

        public static void main(String args[]){
            String s = "0P";
            System.out.println(isPalindrome(s));
        }


}
