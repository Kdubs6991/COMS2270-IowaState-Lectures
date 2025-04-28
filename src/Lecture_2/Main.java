package Lecture_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Hello");
        System.out.print(" This is on the same line.");
        System.out.println("This is on a new line");

        int length = 20;
        int width;
        width = 10;
        int roomArea = length * width;
        System.out.println("The area of the room is " + roomArea + "M");

        double pricePerSquareFoot = 20.71;
        double roomPrice = pricePerSquareFoot * roomArea;
        System.out.println("The price of the room is " + roomPrice);
        String name;

//        Scanner scnr = new Scanner(System.in);
//        System.out.println("Type the name of the hotel: ");
//        name = scnr.nextLine();
//        System.out.println("Type the width: ");
//        width = scnr.nextInt();
//        System.out.println("Type the length: ");
//        length = scnr.nextInt();
//        System.out.println("Type the price of per square foot: ");
//        pricePerSquareFoot = scnr.nextDouble();
//
//        roomArea = length * width;
//        roomPrice = pricePerSquareFoot * roomArea;
//        System.out.println("The price of the room is " + roomPrice);

        int a = 7;
        String n = "Alice";
        System.out.println(n + a + a);
        System.out.println(a + a + n);

    }
}