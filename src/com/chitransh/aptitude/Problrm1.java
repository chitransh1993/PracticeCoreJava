package com.chitransh.aptitude;

//A professional society is using a program to determine possible diverse deputations of 3 members for an upcoming conference. There are m men and w women who are eligible. A deputation is diverse only
// if it contains at least one man and at least one woman. Two deputations are considered distinct if one has a member
// that the other does not. Given a number of men and women, determine the number of distinct ways to select a diverse
// deputation of 3 people.
//
//
//        Example
//        m = 1
//        w = 3
//        There is m = 1 man available and there are w = 3 women. Label them m1, w1, w2, w3 for demonstration.
//        There are 3 possible ways to form a diverse deputation: (m1, w1, w2), (m1, w1, w3) and (m1, w2, w3).
//        The only other possible permutation is (w1, w2, w3), which does not include a man, so it is invalid.
//
//        Function Description
//        Complete the function diverseDeputation in the editor below.
//
//        diverseDeputation has the following parameters:
//        int m: the number of men available
//        int w: the number of women available
//        Returns
//        int: the number of ways to select a diverse deputation from m men and w women
//
//        Constraints
//        0 ≤ m, w ≤ 1000
public class Problrm1 {

    public static void main(String args[]){
        double m = 4, w = 2;
        System.out.println("Possible ways to form a diverse deputation: " +diverseDeputation(m, w));
    }

    public static double diverseDeputation(double men, double women){
        return men > women ? Math.pow(men,women) : Math.pow(women,men);
    }
}
