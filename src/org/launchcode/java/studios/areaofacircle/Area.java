package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double r = input.nextDouble();
        Double a = Circle.getArea(r);
        System.out.println("The area of a circle of radius 2.5 is: " + a);
   }
}
