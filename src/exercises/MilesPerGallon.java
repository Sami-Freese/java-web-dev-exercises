package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double miles;
        double gallons;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles have you traveled:");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas were used:");
        gallons = input.nextDouble();
        mpg = (miles/gallons);
        System.out.println("Your miles per gallon is " + mpg);
    }

}
