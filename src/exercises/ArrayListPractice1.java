package exercises;

import java.util.ArrayList;

public class ArrayListPractice1 {

    public static int evenSum(ArrayList<Integer> arr){
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
            return total;
    }
}



