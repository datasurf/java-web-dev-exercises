package org.launchcode.java.CountingCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args){
        String str = "philly";
        char[] charactersInString = str.toCharArray();

        HashMap<String, Integer> output = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            String letter = String.valueOf(charactersInString[i]);

            if (!output.containsKey(letter)) {
                output.put(letter, 1);
            } else {
                output.put(letter, output.get(letter) + 1);
            }
        }

        for (Map.Entry<String , Integer> iterable : output.entrySet()){
            System.out.println(iterable.getKey() + ":" + iterable.getValue());
        }
    }
}

