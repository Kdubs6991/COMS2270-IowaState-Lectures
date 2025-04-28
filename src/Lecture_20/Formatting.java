package Lecture_20;

public class Formatting {
    public static void main(String[] args) {
        int i = 42;
        String s = "Hello World";
        double d = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706790017801343341523;
        System.out.println(i);
        System.out.printf("Value <%d>%n", i);
        System.out.printf("Value <%4d>%n", i);
        System.out.printf("Value <%04d>%n", i);
        System.out.printf("Value <%-4d>%n", i);
        System.out.printf("Value <%+4d>%n", i);
        System.out.println();
        System.out.printf("Value <%s> <%d>%n", s, i);
        System.out.printf("Value <%-20s> | <%d>%n", s, i);
        System.out.printf("Value <%20s> | <%d>%n", s, i);
        System.out.println();
        System.out.printf("Value <%f> | <%d>%n", d, i);
        System.out.printf("Value <%6.3f> | <%d>%n", d, i); //out of 6 spaces, 3 are decimal places
        System.out.println();
        System.out.println();


    }

}
