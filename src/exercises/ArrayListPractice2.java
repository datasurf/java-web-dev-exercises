package exercises;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static ArrayList<String> wordPrint(ArrayList<String> validWord){
        ArrayList<String> newList = new ArrayList<>();

        for (String word : validWord){
            if (word.length() == 5){
                newList.add(word);
            }
        }
        return newList;
    }
}
