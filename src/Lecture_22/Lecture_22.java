package Lecture_22;

import java.util.Arrays;

public class Lecture_22 {
    //method that returns a reversed array
    public static int[] makeReversedArray(int[] brr) {
        int[] rv = new int[brr.length];
        for (int i = 0; i < brr.length; i++) {
            rv[i] = brr[brr.length - i - 1];
        }
        return rv;
    }

    //version one of method, longer version
    public static void ReverseInPlace1(int[] arr){
        int[] buffer = new int[arr.length];
        int lastCell = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            buffer[i] = arr[lastCell - i];
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = buffer[i];
        }
        arr = buffer;
    }
    //version 2 of method, shorter version
    public static void ReverseInPlace2(int[] arr){
        int lastCell = arr.length - 1;
        for (int i = 0; i < arr.length /2; i++){
            int tmp = arr[i];
            arr[i] = arr[lastCell - i];
            arr[lastCell - i] = tmp;
        }
    }

    public static void main(String[] args) {

        int[] arr;
        arr = new int[10]; //sets aside 10 blocks for int on the heap

        //int[] brr = new int[20];

        arr[0] = 42;
        arr[1] = -10;
        arr[2] = 20;
        arr[3] = -52;

        //prints line by line the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println();/**Spacer for readability**/
        System.out.println(arr); //prints a hash of the array
        arr[1] = 77;
        System.out.println(arr);


        System.out.println();/**Spacer for readability**/
        String str = Arrays.toString(arr); //converts the array to one long string
        System.out.println(str);

        //prints the array backwards
        System.out.println();/**Spacer for readability**/
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //calls a method we created that changes the array to be backwards, then assigns it to a new array
        System.out.println(); /**Spacer for readability**/
        int[] reversed = makeReversedArray(arr);
        System.out.println(Arrays.toString(reversed));
    }
}
