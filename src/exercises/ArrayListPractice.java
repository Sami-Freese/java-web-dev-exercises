package exercises;

import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        int totalEven = 0;
//        for (int i : nums) {
//            if ( i % 2 == 0 ) {
//                totalEven = (totalEven + i);
//            }
//        }
//
//        System.out.println(totalEven);

        String[] words = {"I", "go", "to", "the", "barn", "because", "I", "like", "barns"};

        String fiveWords = "";
        for (String i : words) {
            if (i.length() == 5) {
                fiveWords += (i);
            }
        }

        return fiveWords;
    }
}
