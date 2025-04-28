package Lecture_29;
import java.io.File;
import java.util.ArrayList;

public class Listings {

    /**
     * Lists all files in a directory
     * @param top the file to be listed
     */
    public static void listonelevel(File top){
        //Array of files to store
        File[] files = top.listFiles();

        //For loop to get each file
        for (File g : files){
            System.out.print(g.getName());
            if (g.isDirectory()) {
                System.out.println(" is a dir");
            } else {
                System.out.println(" is a. file");
            }
        }
    }

    /**
     * Lists all files in a directory recursively
     * @param top the file path to be listed
     */
    public static void listAllLevelsExceptRoot(File top){
        //Array of files to store
        File[] files = top.listFiles();

        //base case
        if (top.isFile()){
            System.out.print("File: " + top.getName());
            return;
        }

        //recursive case
        for (File g : files){
            System.out.print("Dir: " + g.getName());
            if (g.isDirectory()) {
                System.out.println(" is a dir");
                listAllLevelsExceptRoot(g);
            } else {
                System.out.println(" is a. file");
            }
        }
    }

    /**
     * Lists all files in a directory recursively
     * @param top the file path to be listed
     */
    public static void listAllFiles(File top, int depth){
        //base case
        if (top.isFile()){
            System.out.println(makeSpaces(depth) + "File: " + top.getName());
            return;
        }

        //recursive case
        System.out.println(makeSpaces(depth) + "Dir: " + top.getName());
        File[] files = top.listFiles();
        for (File g : files){
            listAllFiles(g, depth + 1);
        }
    }

    /**
     * Creates a string of spaces for indentation
     * @param depth the number of spaces
     * @return the string of spaces
     */
    public static String makeSpaces(int depth){
        String r = "";
        for (int i = 0; i < depth; ++i){
            r += "    ";
        }
        return r;
    }

    /**
     * Creates a list of all files in a directory
     * @param f the file
     * @return the list
     */
    public static ArrayList<File> createFileList(File f){
        ArrayList<File> ans = new ArrayList<File>();
        createFileListRecursive(f, ans);
        return ans;
    }

    /**
     * Lists all files in a directory recursively on one line
     * @param f the file
     * @param list the list
     */
    private static void createFileListRecursive(File f, ArrayList<File> list){
        //base case
        if (f.isFile()){
            list.add(f);
            return;
        }
        //recursive case
        File[] files = f.listFiles();
        for (File g : files){
            createFileListRecursive(g, list);
        }
    }

    private int factorial (int acc, int count, int stoppt){
        if (count > stoppt){
            return acc;
        }
        //recursive case
        return factorial(acc * count, count + 1, stoppt);
    }

    //Main Method
    public static void main(String[] args) {
        //String objects with a file path
        String f1 = "/Users/kaloob/Documents/Code/Java/COMS 2270/lecture_examples";
        String f2 = ".";

        //File object creates from a String file path
        File file1 = new File(f1);
        listonelevel(file1);

            System.out.println(); /*Spacer for readability*/

        File file2 = new File(f2);
        listonelevel(file2);

            System.out.println(); /*Spacer for readability*/

        listAllLevelsExceptRoot(file1);

            System.out.println(); /*Spacer for readability*/

        listAllFiles(file1, 0);

            System.out.println(); /*Spacer for readability*/

        //This calls a method that creates the Array list
        //then in that method, it calls the recursive method
        //that prints everything out.
        System.out.println(createFileList(file2));

            System.out.println(); /*Spacer for readability*/

    }
}
