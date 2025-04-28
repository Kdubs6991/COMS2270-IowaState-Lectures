package Lecture_14;

public class MaxFinder {
    public static int max(int a, int b){
        int max;
        if (a > b){
            max = a;
        } else if (b > a){
            max = b;
        } else {
            max = a;
        }
        return max;
    }
    public static int max2(int a, int b){
        int max = a;
        if (b > max){
            max = b;
        }
        return max;
    }

    public static int max3(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //no else clause and only 1 if statement at most
    public static int max4(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int maxOfThree(int a, int b, int c){
        int max;
        if (a > b) {
            //we know b is not the max
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        }else {
            //we know a <= b, b could be the max
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }

    public static int maxOfThree2(int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args){
        //Testing the max statements
        System.out.println(max(4, 6));
        System.out.println(max2(4, 6));
        System.out.println(max3(4, 6));
        System.out.println(max4(4, 6));
        System.out.println(maxOfThree(4, 6, 8));
        System.out.println(maxOfThree2(4, 6, 8));
    }
}
