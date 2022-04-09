package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        length = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        width = input.nextDouble();
        area = (width*length);
        System.out.println("The area of your rectangle is " + area);
    }
}
