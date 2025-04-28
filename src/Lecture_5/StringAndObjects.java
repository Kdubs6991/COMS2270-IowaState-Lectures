package Lecture_5;

public class StringAndObjects {
    public static String shortName(String fullName) {
        String firstInitial = Character.toString(fullName.charAt(0));

        int positionOfSpace = fullName.indexOf(" ");
        String lastName = fullName.substring(positionOfSpace);
        return firstInitial + "." + lastName;
    }

    public static String celebName(String fullName){
        String r1 = fullName.replace("i","iiiiiii");
        String r2 = fullName.replace("l","lllllllll");
        return r2;
    }
    public static void main(String[] args){
        String first = "John";
        String last = new String("Smith");

        int firstLen = first.length();
        int lastLen = last.length();

        System.out.println(firstLen);
        System.out.println(lastLen);

        System.out.println(shortName("Hello World"));
    }
}
