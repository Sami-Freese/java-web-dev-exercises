package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
//        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        if (!input.hasNextDouble()) {
            System.out.println("Please enter a positive, numerical value");
            input.close();
            System.exit(0);
        }
        radius = input.nextDouble();
        input.close();

        if (radius >= 0) {
            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        } else {
            System.out.println("Please enter a positive, numerical value");
        }
    }
}

//        if (radius >= 0) {
//            System.out.println("The area of a circle of radius "+radius+" is: "+Circle.getArea(radius));
//        } else {
//            System.out.println("Please enter a positive, numerical value");
//        }
