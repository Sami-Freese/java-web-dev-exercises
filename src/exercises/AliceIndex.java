package exercises;

import java.util.Scanner;

public class AliceIndex {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister" +
                "on the bank, and of having nothing to do: once or twice she had" +
                "peeped into the book her sister was reading, but it had no pictures or" +
                "conversations in it, 'and what is the use of a boo,' thought Alice " +
                "'without pictures or conversation?'";
        String searchTerm;
        int searchIndex;
        int searchTermLength;
        String quoteMinusSearch;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println(quote);
        System.out.println("What word would you like to search for:");
        searchTerm = input.nextLine().toLowerCase();

        if (quote.toLowerCase().contains(searchTerm)) {
            searchIndex = quote.indexOf(searchTerm);
            searchTermLength = searchTerm.length();
            quoteMinusSearch = quote.substring(0, (searchIndex-1)) + quote.substring((searchIndex + searchTermLength), quote.length());
            System.out.println("true, at index " + searchIndex + " length of " + searchTermLength);
            System.out.println(quoteMinusSearch);

        } else {
            System.out.println("false");
        }

    }
}
