package exercises;

import java.util.Scanner;

public class AliceSearchExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on " +
                "the bank, and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please provide a search term: ");
        String term = input.nextLine().toLowerCase();
        String sentenceLower = aliceSentence.toLowerCase();

        if (sentenceLower.contains(term)){
            System.out.println("The term " + term +" was found!");
            Integer index = sentenceLower.indexOf(term);
            Integer length = term.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = sentenceLower.replace(term,"");
            System.out.println(modifiedSentence);

        } else {
            System.out.println("Sorry term was not found.");
        }
    }
}