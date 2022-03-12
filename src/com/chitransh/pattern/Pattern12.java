package com.chitransh;

public class Pattern12 {
    public static void main (String[] args){
        int alph = 97;
        System.out.println("Printing the pattern");
        for(int i=0; i <= 5; i++){
            for (int j=0; j<=i; j++){
                System.out.print((char) (alph+i)+" ");
            }
            System.out.println();
        }
    }
}
