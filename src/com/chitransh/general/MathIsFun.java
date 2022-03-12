package com.chitransh;

import java.util.*;

class Operation{
    int square(int n){
        return n*n;
    }

    int calculatePower(int n, int pow){
        return n^pow;
    }
}

class Rectangle {
    double area(int length, int width) {
        return length * width;
    }

    double perimeter(int length, int width) {
        return 2 * (length + width);
    }
}

class Circle {
    Operation op;
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rSquare = op.square(radius);
        return pi * rSquare;
    }

    double perimeter(int radius) {
        return 2 * pi * radius;
    }
}

class Square {
    Operation op;

    double area(int side) {
        op = new Operation();
        return op.square(side);
    }

    double perimeter(int side) {
        return 4 * side;
    }
}

class Cube {
    Operation op;

    double volume(int edge) {
        op = new Operation();
        return op.calculatePower(edge, 3);
    }
}

class Sphere {
    Operation op;
    double pi = 3.14;

    double volume(int radius) {
        op = new Operation();
        int radiusPowerThree = op.calculatePower(radius, 3);
        return (4/3) * pi * radiusPowerThree;
    }
}

class Cylinder {
    Operation op;
    double pi = 3.14;

    double volume(int radius, int height) {
        op = new Operation();
        int rSquare = op.square(radius);
        return pi * rSquare * height;
    }
}

public class MathIsFun {

    public static void main(String[] args) {
        System.out.println("Welcome to Maths world !");
        System.out.println("1: to Perform the Area of com.chitransh.Rectangle \n" +
                "2: to Perform the Area of com.chitransh.Circle \n" +
                "3: to Perform the Area of com.chitransh.Square \n" +
                "4: to Perform the Perimeter of com.chitransh.Rectangle \n" +
                "5: to Perform the Perimeter of com.chitransh.Circle \n" +
                "6: to Perform the Perimeter of com.chitransh.Square \n" +
                "7: to Perform the Volume of com.chitransh.Cube \n" +
                "8: to Perform the Volume of com.chitransh.Sphere \n" +
                "9: to Perform the Volume of com.chitransh.Cylinder \n" +
                "0: to exit from the device");

        getInputAndCalculate();
    }

    static void getInputAndCalculate(){

        System.out.print("Enter your choice \n");
        Scanner sc = new Scanner(System.in);
        double n = 0;
        try {
            n = sc.nextInt();

            if (n == 0) {
                System.out.print("Thank you for Using Calculator \n");
            }
            else if(n == 1) {
                Rectangle r = new Rectangle();
                System.out.println("Enter the value of length : ");
                int length = sc.nextInt();
                System.out.println("Enter the value of width : ");
                int width = sc.nextInt();
                System.out.println("The Area of com.chitransh.Rectangle is : "+r.area(length, width));
            }
            else if(n == 2) {
                Circle c = new Circle();
                System.out.println("Enter the value of radius : ");
                System.out.println("The Area of com.chitransh.Circle is : "+c.area(sc.nextInt()));
            }
            else if(n == 3) {
                Square s = new Square();
                System.out.println("Enter the value of a side : ");
                System.out.println("The Area of com.chitransh.Square is : "+s.area(sc.nextInt()));
            }
            else if(n == 4) {
                Rectangle r = new Rectangle();
                System.out.println("Enter the value of length : ");
                int length = sc.nextInt();
                System.out.println("Enter the value of width : ");
                int width = sc.nextInt();
                System.out.println("The Perimeter of com.chitransh.Rectangle is : "+r.perimeter(length, width));
            }
            else if(n == 5) {
                Circle c = new Circle();
                System.out.println("Enter the value of radius : ");
                System.out.println("The Perimeter of com.chitransh.Circle is : "+c.perimeter(sc.nextInt()));
            }
            else if(n == 6) {
                Square s = new Square();
                System.out.println("Enter the value of a side : ");
                System.out.println("The Perimeter of com.chitransh.Square is : "+s.perimeter(sc.nextInt()));
            }
            else if(n == 7) {
                Cube cb = new Cube();
                System.out.println("Enter the value of a edge length : ");
                System.out.println("The Volume of com.chitransh.Cube is : "+cb.volume(sc.nextInt()));
            }
            else if(n == 8) {
                Sphere sphr = new Sphere();
                System.out.println("Enter the value of radius : ");
                System.out.println("The Volume of com.chitransh.Sphere is : "+sphr.volume(sc.nextInt()));
            }
            else if(n == 9) {
                Cylinder cyldr = new Cylinder();
                System.out.println("Enter the value of base : ");
                int base = sc.nextInt();
                System.out.println("Enter the value of height : ");
                int height = sc.nextInt();
                System.out.println("The Volume of com.chitransh.Cylinder is : "+cyldr.volume(base, height));
            }
            else {
                System.out.print("Invalid input ! Please try again .. \n");
                getInputAndCalculate();
            }

            if (n != 0) getInputAndCalculate();

        } catch (InputMismatchException ine){
            System.out.print("Invalid input ! Please try again .. \n");
            getInputAndCalculate();
        } catch (Exception e){
            System.out.print("Invalid input ! Please try again .. \n");
            getInputAndCalculate();
        }
    }
}
