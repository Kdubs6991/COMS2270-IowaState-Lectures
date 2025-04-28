package Lecture_31;

import java.util.Arrays;

public class MergeSort {
    /**
     * Sorts the given array using recursion
     * @param arr the given array
     */
    public static void mergeSort(int[] arr){
        //base case
        if (arr.length <= 1){
            return;
        }

        int firstLength = arr.length / 2;
        int[] first = Arrays.copyOf(arr, firstLength); //Copy of because start from 0
        //Copy of Range because doesn't start at 0
        int[] second = Arrays.copyOfRange(arr, firstLength, arr.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, arr);
    }

    /**
     * Merges the given arrays
     * @param a
     * @param b
     * @param result
     */
    public static void merge (int[] a, int[] b, int[] result) {
        int i = 0; //will work with the array a
        int j = 0; //will work with the array b
        int k = 0; //will work with the array result

        while(i < a.length && j < b.length){
            if (a[i] < b[j]){
                result[k++] = a[i++]; //this bumps up the count after the data was copied
            } else {
                result[k++] = b[j++];
            }
        }
        //the b's run out
        while (i < a.length){
            result[k++] = a[i++];
        }
        //the a's run out
        while (j < b.length){
            result[k++] = b[j++];
        }
        //the merge is done

    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 34, 22, 12, 25, 10};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
