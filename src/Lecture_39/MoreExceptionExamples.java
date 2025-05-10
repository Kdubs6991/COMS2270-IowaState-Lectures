package Lecture_39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}

public class MoreExceptionExamples {

    public static double getValueFromFile (File file) throws InvalidFormatException, FileNotFoundException {
        double result = 0.0;
        Scanner scnr = null;
        try{
            scnr = new Scanner(file);
            result = scnr.nextDouble();
            if (result < 0) {
                InvalidFormatException e = new InvalidFormatException("File has negative value");
                throw e;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (scnr != null){
                scnr.close();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        File file = new File("/Users/kaloob/Documents/Code/Java/COMS 2270/lecture_examples/src/Lecture_39/demo3.txt");
        double result = 0.0;
        try {
            result = getValueFromFile(file);
            System.out.println("Result: " + result);
        } catch (InvalidFormatException e) {
            System.out.println("There was a negative number.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("End of program");
    }
}
