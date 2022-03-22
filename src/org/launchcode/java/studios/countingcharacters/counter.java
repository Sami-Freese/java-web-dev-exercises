package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        String quote;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a quote to be counted: ");

        quote = input.nextLine();
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteArray = quote.toUpperCase().toCharArray();

        HashMap<Character, Integer> countedLetters = new HashMap<>();

        for (char c : quoteArray) {
            if (countedLetters.containsKey(c)) {
                countedLetters.put(c, countedLetters.get(c) + 1);
            } else if (Character.isLetter(c)){
                countedLetters.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> letter : countedLetters.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
