package Lecture_25;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        AL al = new AL(); //create an ArrayList with an Integer object
        System.out.println(al); //shows the list is empty when created

        al.add(0); //adds to the end with the value given
        al.add(11);
        al.add(22);
        al.add(33);
        System.out.println(al);
        al.add(44);
        al.add(55);
        System.out.println(al);
        al.set(3, 36); //Sets a specific position in the list (replaces old one)
//        al.set(999, 3);
        System.out.println(al);

        int j = al.get(1); //gets the value at a specific position
        System.out.println(j);

        al.insert(3, 35); //inserts a value at a specific position (slides the existing values over)
        System.out.println(al);

        al.remove(4); //removes a value at a specific position
        System.out.println(al);

        System.out.println(); /*Spacer for readability*/
    }
}
class AL {
    private int used; //tells us how many elements are in the list
    private int[] arr;
    public static final int DEFAULT_SIZE = 1; //DEFAULT_SIZE

    public AL(){ //constructor for AL class
        used = 0;
        arr = new int[DEFAULT_SIZE];
    }

    /**
     * Returns the size of the ArrayList
     * @return variable used (size of array)
     */
    public int size(){
        return used;
    }

    /**
     * returns the capacity of the ArrayList
     * @return the length of the array
     */
    public int capacity(){
        return arr.length;
    }

    /**
     * Doubles the capacity of the given array and outputs
     * that it is doing so. Exponentially grows to the powers of 2
     * @param given (the array to double)
     * @return bigger (the new array that is double the size)
     */
    public static int[] doubleTheCapacity(int[] given){
        System.out.println("Doubling the capacity from" + given.length);
        int[] bigger = new int[given.length * 2];
        for (int i = 0; i < given.length; i++){
            bigger[i] = given[i];
        }
        return bigger;
    }



    /**
     * adds an element to the end of the ArrayList
     * @param what (the element to add)
     */
    public void add(int what){
        System.out.println("Adding " + what);
        doubleTheCapacityIfNeeded();
        arr[used] = what;
        used++;
        System.out.println(this);

    }

    /**
     * returns the element at the given index
     * @param index (the index to get)
     * @return arr[index] (the value at the index)
     */
    public int get(int index){
        System.out.println("Getting from " + index);
        if (isValidIndex(index)) {
            System.out.println(this);
            return arr[index];
        } else {
            System.out.println(this);
            return -1;
        }
    }

    /**
     * Sets the element at the given index with the given value
     * replaces old element. Deletes that old value
     * @param index (the index to set)
     * @param value (the value to set at the index)
     */
    public void set(int index, int value){
        System.out.println("Setting at " + index + " to " + value);
        if (isValidIndex(index)) {
            arr[index] = value;
        }
    }

    /**
     * Inserts value at the given index with the given value
     * scoots everything over when inserted
     * @param index (the index to insert at)
     * @param value (the value to insert at the index)
     */
    public void insert(int index, int value){
        System.out.println("Inserting at " + index + " to " + value);
        if (isValidIndex(index) || index == used) {
            doubleTheCapacityIfNeeded();
            for (int i = used - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
            used++;
        }
    }

    /**
     * Removes an element at the given index
     * @param index (the index to remove)
     */
    public void remove(int index){
        System.out.println("Removing at " + index);
        if (isValidIndex(index)) {
            for (int i = index; i <= used - 1; i++) {
                arr[i] = arr[i + 1];
            }
            used--;
        }
    }

    /**
     * Overrides the normal toString method and prints the ArrayList
     * in a specific format
     * @return a string of the ArrayList in our specific format
     */
    @Override
    public String toString(){
        final String LEFT_END = "[";
        final String RIGHT_END = "]";
        final String SEPARATOR = ", ";
        String returnValue = LEFT_END;
        for (int i = 0; i < used; i++) {
            if (i > 0) { returnValue += SEPARATOR; }
            returnValue += arr[i];
        }
        returnValue += RIGHT_END;
        returnValue += "; size =";
        returnValue += used;
        returnValue += "; capacity =";
        returnValue += arr.length;
        return returnValue;
    }

    /**
     * this method is not static (it knows that it is a member of the class)
     * so it can call the variables of the class and not need to be passed
     * The method doubles the capacity of the ArrayList if its needed
     */
    private void doubleTheCapacityIfNeeded(){
        if (used == arr.length) {
            System.out.println("Doubling the capacity from" + arr.length);
            int[] bigger = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                bigger[i] = arr[i];
            }
            arr = bigger;
        }
    }

    /**
     * Checks if the given index is valid and returns a boolean based on the output
     * @param index (the index to check)
     * @return a boolean based on if the index is valid
     */
    private boolean isValidIndex(int index){
        boolean r = (0 <= index && index < used);
        if (!r) {
            System.out.println("This is a bad index: " + index);
        }
        return r;
    }
}