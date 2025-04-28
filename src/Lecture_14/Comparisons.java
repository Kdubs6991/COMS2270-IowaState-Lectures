package Lecture_14;

public class Comparisons {

    public static void main(String[] args){
        String a = "Apple";
        String b = "Blueberry";
        String c = "Cherry";

        // returns -1 if this < other
        // returns 0 if this == other
        // returns 1 if this > other
        System.out.println("a vs b= " + a.compareTo(b));
        System.out.println("b vs b= " + b.compareTo(b));
        System.out.println("c vs b= " + c.compareTo(b));
    }
}
