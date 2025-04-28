package Lecture_15;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Continue?:  y/n");
        String input = scnr.next();
        //while loop
        while (input.equals("y")) {
            System.out.println("Hello");

            System.out.println("Continue?:  y/n");
            input = scnr.next();
        }
        System.out.println("bye");
        scnr.close();

        //do-while loop (does code then checks if it repeats)
        do {
            System.out.println("Continue?:  y/n");
            input = scnr.next();
            if (input.equals("y")) {
                System.out.println("Hello");
            }
        } while (input.equals("y"));
        System.out.println("bye");
        scnr.close();

        int n = 3;
        do{
            System.out.println("Hello");
            n = n-1;
        } while (n > 0);
    }
}
