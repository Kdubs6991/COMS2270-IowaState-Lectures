package Lecture_30;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Returns the index of the minimum value in the given array
     * @param arr the given array
     * @param start starting index
     * @return the index of the minimum value
     */
    private static int indexOfMin(int[] arr, int start){
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++){
            if (arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Swaps the values at the given indexes
     * @param arr the given array
     * @param i 1st value to swap
     * @param j 2nd value to swap
     */
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Sorts the given array using a For Loop
     * @param arr the given array to sort
     */
    public static void selectionSort(int[] arr){
        for (int k = 0; k < arr.length - 1; k++){
            int minIndex = indexOfMin(arr, k);
            swap(arr, k, minIndex);
        }
    }

    /**
     * Sorts the given array using recursion
     * @param arr the given array
     * @param i the current index
     */
    public static void SelectionSortRecursion(int[]arr, int i){
        //base case
        if (i == arr.length - 1){
            return;
        }

        //recursive case
        int minIndex = indexOfMin(arr, i);
        swap(arr, i, minIndex);
        SelectionSortRecursion(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {22, 5, 83, 34, 97, 11, 48, 72}; //Array to sort
        int[] arr2 = {22, 5, 83, 34, 97, 11, 48, 72}; //Array to sort
        System.out.println("Index of min Value: " + indexOfMin(arr1, 2));

        System.out.println(); /*Spacer for readability*/

        //sorts the array using the for loop method
        System.out.println(Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(); /*Spacer for readability*/

        //sorts the array using the recursion method
        System.out.println(Arrays.toString(arr2));
        SelectionSortRecursion(arr2, 0);
        System.out.println(Arrays.toString(arr2));
    }
}