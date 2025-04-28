package Lecture_24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList namesAny = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Kim");
        names.add("Sue");

        System.out.println(names.size());
        System.out.println(names); //you dont need to put .toString when printing, Java does it for you

        System.out.println(); /*spacer for readability*/
        for (int i = 0; i < names.size(); i++) { //for loop that prints each name in the Array List
            System.out.println(names.get(i));
        }

        System.out.println(); /*spacer for readability*/
        //different style of for loop, easier to write
        //The format is for (type variable : array/collection) {use variable in loop}
        int count = 1;
        for (String name : names) { //for each loop that prints each name in the Array List
            System.out.println("" + count + "." + name);
            count++;
        }
        System.out.println(); /*spacer for readability*/

        names.add(1, "John"); //add at a specific index, makes everything else shift over
        System.out.println(names);
        names.remove(2); //removes a specific index, everything else shifts over
        System.out.println(names);
        names.remove("John"); //removes a specific value, everything else shifts over
        System.out.println(names);
    }
}
