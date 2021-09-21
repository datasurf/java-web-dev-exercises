package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius) {
        return 3.14 * radius * radius;
    }
    public static boolean isStringInteger(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }

    public static boolean isStringDouble(String number ){
        try{
            Double.parseDouble(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
