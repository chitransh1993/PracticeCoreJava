//package com.chitransh;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//class Result {
//
//    /*
//     * Complete the 'compareTriplets' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY a
//     *  2. INTEGER_ARRAY b
//     */
//
////    public static List<Integer> compareTriplets(String a, List<Integer> b) {
////        String result = new String();
////        int h = Integer.parseInt(a.substring(0,2));
////
////        if('P' == (a.charAt(8))) h += 12;
////        result = String.valueOf(h) + a.substring(3,9);
////        return result;
////    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> a = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            int aItem = Integer.parseInt(aTemp[i]);
//            a.add(aItem);
//        }
//
//        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> b = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            int bItem = Integer.parseInt(bTemp[i]);
//            b.add(bItem);
//        }
//
//        List<Integer> result = Result.compareTriplets(a, b);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}