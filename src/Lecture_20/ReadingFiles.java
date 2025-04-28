package Lecture_20;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static String processLine(String theLine){
        Scanner s = new Scanner(theLine);
        String name = s.next();

        double total = 0.0;
        int count = 0;
        while (s.hasNextInt()){
            int value = s.nextInt();
            total += value;
            count++;
        }
        return String.format("The average of: %s is %.2f", name, (total/count));
    }

    public static void readAllLines(Scanner scnr){
        String oneLine;
        while (scnr.hasNextLine()){
            oneLine = scnr.nextLine();
            System.out.printf("oneLine=<%s> %n", oneLine);
            System.out.println(processLine(oneLine));
        }
    }

    public static int indexOf(String txt, String sub){
        int index = -1;
        int i;
        int j;

        for (i = 0; i <= txt.length(); ++i){
            j = 0;
            while (j < sub.length() && i + j < txt.length() && txt.charAt(i + j) == sub.charAt(j)){
                ++j;
            }
            if (j == sub.length()){
                index = i;
                break;
            }
        }
        return index;
    }

    //main program to run
    public static void main(String[] args) {
        String abs = "/users/yourname/docs/readme.txt";
        String rel = "Lecture_20/readme.txt";

        File file = new File("resources/example.txt");

        if (file.exists()){ //checks if the file actually exists
            System.out.println("File exists");
        }else{
            System.err.println("File does not exist"); //err formats the output as an error
        }

        System.out.println();

        //example with readme file in src folder
        File fle = new File("/Users/kaloob/Documents/Code/Java/COMS 2270/lecture_examples/src/Lecture_20/readme.txt");
        if (fle.exists()){ //checks if the file actually exists
            System.out.println("File exists");
        }else{
            System.err.println("File does not exist"); //err formats the output as an error
        }

        System.out.println();

        Scanner scnr = null;
        //try catch using a scanner. It won't cause an issue with the program if it's not found
        try {
            scnr = new Scanner(fle);
        } catch (FileNotFoundException e) { //instead of terminating the program it does what is in the block
            System.err.println("File not found in catch");
        }

        System.out.println();

        readAllLines(scnr);
        scnr.close();
    }
}
