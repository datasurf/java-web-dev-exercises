package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String r = input.nextLine();

        while(!Circle.isStringDouble(r)||!Circle.isStringInteger(r)||Double.parseDouble(r)<=0||Integer.parseInt(r)<=0){
            System.out.println("ERROR!!!! Not a valid input");
            System.out.println("Enter a radius: ");
            r = input.nextLine();
        }

        Double r2 = Double.parseDouble(r);
        Double a = Circle.getArea(r2);
        System.out.println("The area of a circle of radius 2.5 is: " + a);
   }
}
