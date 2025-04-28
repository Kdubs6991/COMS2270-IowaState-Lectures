package Lecture_23;

import java.util.Arrays;

public class ArrayExamples_3 {
    public static int[] removeElement(int[] arr, int position){
        int[] removed = new int[arr.length - 1]; //new array with 1 less element
        //loop that copies the array to new one until the deleted position
        //then it skips the deleted position and copies rest
        for (int i = 0; i < removed.length; ++i) {
            if (i < position) {
                removed[i] = arr[i];
            } else {
                removed[i] = arr[i + 1];
            }
        }
        return removed;
    }

    public static int[] insertElement(int[] arr, int pos, int value){
        //initialize new array to return
        int[] newa = new int[arr.length + 1];
        //loop that copies array to new array until the desired position
        //then at the position it inserts the value and copies the rest after
        for (int i = 0; i < newa.length; ++i){
            if (i < pos){
                newa[i] = arr[i];
            } else if (i == pos){
                newa[i] = value;
            } else {
                newa[i] = arr[i - 1];
            }
        }

        return newa;
    }

    public static void main(String[] args) {
        //initialize array's values when creating it
        int[] a = {0, 11, 22, 33, 44, 55, 66};
        //initialize array by calling a method
        int[] b = removeElement(a, 3);
        System.out.println(Arrays.toString(b));

        int[] c = {0, 11, 22, 33, 44, 55, 66};
        int[] d = insertElement(c, 33, 77);
        System.out.println(Arrays.toString(d));
    }
}
