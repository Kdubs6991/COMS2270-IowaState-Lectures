package Lecture_27;

public class Recursion {

    /**
     * Method calls itself recursively. And i counts how many
     * stack frames are in the call stack before stack overflow
     * @param i int that counts the stack frames
     */
    public static void foo(int i){
        System.out.println("Hello " + i);
        foo(i + 1);
    }

    /**
     * This method counts from 1 to n
     * @param n the number to count to
     */
    public static void countFrom(int n){
        if (n == 0){
            return;
        }
        System.out.println(n); //counts down
        countFrom(n - 1);
        System.out.println(n); //counts up
    }

    /**
     * This method finds the factorial of n
     * @param n the number
     * @return the factorial
     */
    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        return fact(n-1) * n;
    }

    /**
     * This method performs the fibonacci sequence
     * @param n the number
     */
    public static int fib(int n){
        if (n <= 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    /**
     *
     * @param s
     * @return
     */
    public static boolean isPal(String s){
        if (s.length() <= 1){
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPal(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
//        foo(0);
        countFrom(5);
        System.out.println(); /*Spacer for readability*/
        fact(4);
        System.out.println(); /*Spacer for readability*/
        System.out.println(fib(5));
        System.out.println(); /*Spacer for readability*/
        System.out.println(isPal("racecar"));
        System.out.println(isPal("Banana"));
    }
}
