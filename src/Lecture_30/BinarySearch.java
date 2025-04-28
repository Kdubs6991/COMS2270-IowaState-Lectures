package Lecture_30;

import java.util.Arrays;

public class BinarySearch {

    /**
     * Returns the index of the given value in the given array
     * Uses a recursive binary search
     * @param arr the given array to search
     * @param value the value to search for
     * @param i left parameter to search from
     * @param j right parameter to search to
     * @return the index of the given value (-1 if not found)
     */
    private static int recursiveBinarySearch(int[] arr, int value, int i, int j){
        //base case
        if (i > j){
            return -1; //not found
        }

        //recursive case
        int mid = (i + j) / 2;
        System.out.println("Searching between " + i + " and " + j + " at index " + mid);
        if (arr[mid] == value){
            return mid;
        } else if (arr[mid] > value){
            return recursiveBinarySearch(arr, value, i, mid - 1);
        } else {
            return recursiveBinarySearch(arr, value, mid + 1, j);
        }
    }

    /**
     * Returns the index of the given value in the given array
     * Uses a non-recursive binary search
     * @param arr the given array to search
     * @param value the value to search for
     * @return the index of the given value (-1 if not found)
     */
    public static int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            System.out.println("Searching between " + low + " and " + high + " at index " + mid);
            if (arr[mid] == value){
                return mid;
            } else if (arr[mid] > value){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {22, 5, 83, 34, 97, 11, 48, 72};//Array to search
        System.out.println("Unsorted Array: " + Arrays.toString(arr1));
        SelectionSort.selectionSort(arr1); //Sorts array with method from other class
        System.out.println("Sorted Array: " + Arrays.toString(arr1));

        System.out.println(); /*Spacer for readability*/
        System.out.println(recursiveBinarySearch(arr1, 34, 0, arr1.length));
        System.out.println(); /*Spacer for readability*/
        System.out.println(binarySearch(arr1, 22));

    }
}
