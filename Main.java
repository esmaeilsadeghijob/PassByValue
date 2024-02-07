package org.example;

// Java is always pass by value
public class Main {

    public static void main(String[] args) {
        Paint red = new Paint("Red"); // memory ref = 50
        Paint blue = new Paint("Blue"); // memory ref = 100

        swap(red, blue);// memory ref = 50, // memory ref = 100
        System.out.println(red.getColor());// memory ref = 50
        System.out.println(blue.getColor());// memory ref = 100

        changeValue(blue);// memory ref = 100
        System.out.println(blue.getColor());// memory ref = 100
    }

    public static void swap(Object o1, Object o2) {  // memory ref = 50 , memory ref = 100
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }

    public static void changeValue(Paint paint) { // memory ref = 100
        paint.setColor("Red"); // memory ref = 100
        paint = new Paint("Green");  // memory ref = 200
        paint.setColor("Blue"); //  memory ref = 200
    }
}