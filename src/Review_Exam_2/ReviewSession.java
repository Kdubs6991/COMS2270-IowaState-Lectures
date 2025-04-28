package Review_Exam_2;

import java.util.ArrayList;

public class ReviewSession {
    /**
     * Method only copies one instance of a number and deletes
     * the duplicates.
     *
     * @param dupsArr given Array
     * @return new Array
     * uses an array list inside but takes in and outputs a normal array
     */
    public static int[] removeDuplicates(int[] dupsArr) {
        ArrayList<Integer> noreps = new ArrayList<Integer>();


        boolean isdup;
        for (int i = 0; i < dupsArr.length; i++) {
            isdup = true;
            for (int j = 0; j < i; j++) {
                if (dupsArr[j] == dupsArr[i]) {
                    isdup = false;
                }
            }
            if (!isdup) {
                noreps.add(dupsArr[i]);
            }
        }

        int[] newArr = new int[noreps.size()];
        for (int i = 0; i < noreps.size(); ++i) {
            newArr[i] = noreps.get(i);
        }
        return newArr;
    }

    /**
     * Method takes in an array and returns a 2D array that shifts it over
     * to the right on every row
     *
     * @param arr given an array
     * @return 2D array
     */
    public static int[][] rightShift(int[] arr) {
        int[][] ans = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j) {
                    ans[i][j] = 0;
                } else {
                    int diff = j - i;
                    ans[i][j] = arr[diff];
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] newArr = {1, 2, 3, 4, 5};
        int[][] shiftedArr = rightShift(newArr);
        for (int i = 0; i < shiftedArr.length; i++) {
            for (int j = 0; j < shiftedArr[i].length; j++) {
                System.out.print(shiftedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
