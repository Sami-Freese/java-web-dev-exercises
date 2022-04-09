package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister" +
                "on the bank, and of having nothing to do: once or twice she had" +
                "peeped into the book her sister was reading, but it had no pictures or" +
                "conversations in it, 'and what is the use of a boo,' thought Alice " +
                "'without pictures or conversation?'";
        String searchTerm;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println(quote);
        System.out.println("What word would you like to search for:");
        searchTerm = input.nextLine().toLowerCase();

        if (quote.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
