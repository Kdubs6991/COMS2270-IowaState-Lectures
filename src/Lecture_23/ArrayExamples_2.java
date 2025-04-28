package Lecture_23;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples_2 {
    //main method to run
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] ratings = new int[5]; //new Array to store the ratings

        //string for the rating prompt
        String prompt = "Enter rating (1 to 5), -1 to quit: ";
        System.out.println(prompt);
        int rating = scnr.nextInt();

        //loop to get the ratings and put them in array. and repeats until quit
        while (rating != -1){
            //main body of loop
            if (rating <= 5 && rating >= 1){
                ratings[rating - 1]++;
            }
            System.out.println(prompt); //asks for the next rating
            rating = scnr.nextInt(); //gets the next rating
        }
        scnr.close();

        //print out the results
        System.out.println((Arrays.toString(ratings)));
    }
}
