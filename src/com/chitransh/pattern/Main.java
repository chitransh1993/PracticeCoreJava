package com.chitransh;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hi, Chitransh !");

        int randomDigit = 10;
        PrintNumber(randomDigit);
    }

    public static void PrintNumber(int randomDigit){

        int a, b, c, d, e = 0;

        a = 10000* (randomDigit / 2);
        b = 1000* (randomDigit % 3);
        c = 100* (randomDigit % 4);
        d = 10* (randomDigit % 5);
        e = 1* (randomDigit % 1);

        int sum = a+b+c+d+e;
        System.out.println(sum);
    }
}
