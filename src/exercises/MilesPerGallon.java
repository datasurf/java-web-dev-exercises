package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons have you consuimed?");
        Double gallons = input.nextDouble();
        Double total = miles/gallons;
        System.out.println("Your total miles per gallon is " + total);
    }
}
