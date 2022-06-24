package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main (String [] args) {
        int[] integerArray = {1,1,2,3,5,8};
        Scanner input = new Scanner(System.in);

        for (int i : integerArray) {
            if (i % 2 == 1)
            System.out.println(i);
        }
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] greenWords = greenEggs.split(" ");
        System.out.println(Arrays.toString(greenWords));

        String[] greenSentences = greenEggs.split("\\.");
        System.out.println(Arrays.toString(greenSentences));

    }

}
