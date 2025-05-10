package Lecture_38;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static double findAverage(File file) throws FileNotFoundException{
        Scanner scnr = new Scanner(file);
        int total = 0;
        int count = 0;
        while (scnr.hasNext()){
            total += scnr.nextInt();
            count++;
        }
        return total / count;
    }

    public static double findAvg() throws FileNotFoundException{
        String fileName = "";
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = scnr.nextLine();
        File file = new File(fileName);
        double abg = findAverage(file);
        return abg;
    }

    public static void main(String[] args)  {
        File file = new File("/Users/kaloob/Documents/Code/Java/COMS 2270/lecture_examples/src/Lecture_38/exceptiondemo.txt");
        try{
            double average = findAverage(file);
            System.out.println("Average is " + average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("File has no data");
        } catch (InputMismatchException e) {
            System.out.println("File has wrong format");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This is in finally block");
        }
        System.out.println("End of program");

        System.out.println(); /*Spacer for readability*/

        try {
            double average = findAvg();
            System.out.println("Average is " + average);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            System.out.println("File has no data");
        }
        catch (InputMismatchException e) {
            System.out.println("File has wrong format");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This is in finally block");
        }
        System.out.println("End of program");
    }

}
