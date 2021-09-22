package exercises;

import java.util.ArrayList;

//This is the main for ArrayListPractice exercises
public class ArrayListPractice1Main {
    public static void main(String[] args) {
        //Array List Practice part 1:
        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(1);
        numArrayList.add(2);
        numArrayList.add(3);
        numArrayList.add(4);
        numArrayList.add(5);
        numArrayList.add(6);
        numArrayList.add(7);
        numArrayList.add(8);
        numArrayList.add(9);
        numArrayList.add(10);

        System.out.println("Array List Practice part 1:");
        System.out.println(ArrayListPractice1.evenSum(numArrayList));
        System.out.println("");

        //Array List Practice part 2:
        ArrayList<String> wordArray = new ArrayList<>();
        wordArray.add("Hello");
        wordArray.add("Test");
        wordArray.add("Hi");
        wordArray.add("Hola");
        wordArray.add("Saludos");
        wordArray.add("Seven");
        wordArray.add("tea");
        wordArray.add("I");

        System.out.println("Array List Practice part 2:");
        System.out.println(ArrayListPractice2.wordPrint(wordArray));
        System.out.println("");

        //Array List Practice part 3:
        System.out.println("Array List Practice part 3:");
        System.out.println(ArrayListPractice3.wordSearch(wordArray));
        System.out.println("");

        //Array List Practice part 4 BONUS:
        System.out.println("Array List Practice part 4 Bonus:");
        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println(ArrayListPractice4Bonus.strWordSearch(str));
        System.out.println("");

    }
}
