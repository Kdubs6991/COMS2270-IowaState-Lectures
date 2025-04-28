package Lecture_15;

public class ShortCircuit {
    public static boolean soTrue() {
        System.out.println("Returnning true");
        return true;
    }

    private static boolean soFalse() {
        System.out.println("Returnning false");
        return false;
    }

    public static void main(String[] args) {
        //This goes through every step because it needs to
        //check if both are true
        if (soTrue() && soFalse()) {
            System.out.println("ans is true");
        }else {
            System.out.println("ans is false");
        }

        //This only goes through soFalse() since and statements if 1
        //is false then all is false. Short circuit type
        if (soFalse() && soTrue()) {
            System.out.println("ans is true");
        }else {
            System.out.println("ans is false");
        }

        //This goes through soTrue() only because if 1 true on an OR
        //statement then all is true. short circuit type
        if (soTrue() || soFalse()) {
            System.out.println("ans is true");
        }else {
            System.out.println("ans is false");
        }

        //This runs through it all since it needs to check if the other
        //value is true or false, because 2 false = false with Or statement
        if (soFalse() || soTrue()) {
            System.out.println("ans is true");
        }else {
            System.out.println("ans is false");
        }

        boolean isBalloon = true;
        boolean isRed = false;
        //balloon example from zybooks
        if (isBalloon && !isRed){
            System.out.println("Balloon");
        } else if (isBalloon) {
            System.out.println("Red Balloon");
        } else {
            System.out.println("Not a balloon");
        }
    }
}
