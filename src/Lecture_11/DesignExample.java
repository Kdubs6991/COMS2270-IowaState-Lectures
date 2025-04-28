package Lecture_11;

import java.util.Scanner;

public class DesignExample {
    //Constant variables (measurements) (static to only have 1 copy)
    public static final double FEET_PER_STEP = 2.5;
    public static final int FEET_PER_MILE = 5280;
    public static final double STEPS_PER_MINUTE = 70.0;
    public static final double CALORIES_PER_MINUTE_WALKING = 3.5;

    //Method to convert steps walked into miles
    //(public to access it anywhere)(static so it doesn't use instance variables)
    public static double convertStepsToMiles(int stepsWalked){
        return stepsWalked * FEET_PER_STEP * (1.0 / FEET_PER_MILE);
    }
    //Method to output miles walked and calls calculation method from here
    //(void because doesn't return anything)
    public static void outputMiles(int stepsWalked){
        double milesWalked = convertStepsToMiles(stepsWalked);
        System.out.println("Miles Walked: " + milesWalked);
    }

    //Method to convert steps walked to calories burned
    //(public to access it anywhere)(static so it doesn't use instance variables)
    public static double convertStepsToCalories(int stepsWalked){
        double minutesTotal = stepsWalked / STEPS_PER_MINUTE;
        return minutesTotal * CALORIES_PER_MINUTE_WALKING;
    }

    //Method to output calories and calls calculation method from here
    //(void because no return anything)
    public static void outputCalories(int stepsWalked){
        double caloriesTotal = convertStepsToCalories(stepsWalked);
        System.out.println("Calories Burned: " + caloriesTotal);
    }

    //Method to get input from user (creates scanner object and closes it)
    //(method so it can be called again or moved to another file for futureproof)
    public static int inputSteps(){
        Scanner scnr = new Scanner(System.in); //create scanner to take input

        System.out.print("Enter number of steps walked:");
        int valueTyped = scnr.nextInt(); //Put it into variable so we can close scanner
        scnr.close(); //close scanner so no memory leaks
        return valueTyped;
    }
    public static void outputToScreen(double milesWalked, double caloriesTotal){

    }

    //main method to run program
    public static void main (String[] args){

        //methods to output calories and miles(performs caluclations in those methods)
        int stepsWalked = inputSteps(); //Also calls the method to get input
        double milesWalked = convertStepsToMiles(stepsWalked);
        double caloriesTotal = convertStepsToCalories(stepsWalked);

        outputToScreen(milesWalked, caloriesTotal);
    }
}
