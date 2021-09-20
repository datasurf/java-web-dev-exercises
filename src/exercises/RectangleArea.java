package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the length of the rectangle:");
        Integer length = input.nextInt();
        System.out.println("Please provide the width of the rectangle:");
        Integer width = input.nextInt();
        Integer area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}

