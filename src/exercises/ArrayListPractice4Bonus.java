package exercises;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice4Bonus {

    public static ArrayList<String> strWordSearch(String str){
        Scanner input = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();
        str = str.replace(",", "");
        String[] strArray = str.split(" ");
        List<String> al = new ArrayList<String>();

        al = Arrays.asList(strArray);

        System.out.println("Enter length of word to search for on list: ");
        int wordLength = input.nextInt();

        for (String word : al){
            if (word.length() == wordLength){
                newList.add(word);
            }
        }
        return newList;
    }
}

