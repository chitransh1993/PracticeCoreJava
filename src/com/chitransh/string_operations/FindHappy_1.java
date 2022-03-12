package com.chitransh.string_operations;

/*
A string s is called happy if it satisfies the following conditions:
s only contains the letters 'a', 'b', and 'c'.
s does not contain any of "aaa", "bbb", or "ccc" as a substring.
s contains at most a occurrences of the letter 'a'.
s contains at most b occurrences of the letter 'b'.
s contains at most c occurrences of the letter 'c'.
Given three integers a, b, and c, return the longest possible happy string.
If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".

A substring is a contiguous sequence of characters within a string.

Example 1:
Input: a = 1, b = 1, c = 7
Output: "ccaccbcc"
Explanation: "ccbccacc" would also be a correct answer.

Example 2:
Input: a = 7, b = 1, c = 0
Output: "aabaa"
Explanation: It is the only correct answer in this case.

Constraints:

0 <= a, b, c <= 100
a + b + c > 0
*/
public class FindHappy_1 {

    public static void main(String args[]){
        int a = 11, b = 35, c = 28;
        System.out.println(findHappyString(a, b, c));
    }

    private static String findHappyString(int a, int b, int c) {
        String out = "", currString = "";
        int aCount = a, bCount = b, cCount = c, totalLen = a+b+c;

        for(int i=0; i<totalLen;i++){
            if((aCount > 0) && ((aCount>=bCount) || currString.equals("b")) && ((aCount>=cCount) || currString.equals("c")) && !currString.equals("a")){
                if(aCount > 1) {
                    out+="aa";
                    aCount-=2;
                    i++;
                } else {
                    out+="a";
                    aCount--;
                }
                currString = "a";
            } else if((bCount > 0) && ((bCount>=cCount) || currString.equals("c")) && ((bCount>=aCount) || currString.equals("a")) && !currString.equals("b")){
                if(bCount > 1) {
                    out+="bb";
                    bCount-=2;
                    i++;
                } else {
                    out+="b";
                    bCount--;
                }
                currString = "b";
            } else if((cCount > 0) && ((cCount>=aCount) || currString.equals("a")) && ((cCount>=bCount) || currString.equals("b")) && !currString.equals("c")){
                if(cCount > 1) {
                    out+="cc";
                    cCount-=2;
                    i++;
                } else {
                    out+="c";
                    cCount--;
                    i++;
                }
                currString = "c";
            }

        }

        return out;
    }

}
