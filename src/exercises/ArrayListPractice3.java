package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice3 {

    public static ArrayList<String> wordSearch(ArrayList<String> validWord){
        Scanner input = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();

        System.out.println("Enter length of word to search for on list: ");
        int wordLength = input.nextInt();

        for (String word : validWord){
            if (word.length() == wordLength){
                newList.add(word);
            }
        }
        return newList;
    }
}