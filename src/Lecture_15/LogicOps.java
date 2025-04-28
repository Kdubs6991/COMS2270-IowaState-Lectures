package Lecture_15;

public class LogicOps {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int x = 0;

        if (a > b && b > c) {
            x = x + 1;
        }

        if (a > b){
            if (b > c){
                x = x + 1;
            }
        }

        if (a > b || b > c) {
            x = x + 1;
        }
        if (a>b){
            x = x + 1;
        } else if (b > c) {
            x = x + 1;
        }
        if (a > b) {
            x = x + 1;
        }
        if (b > c) {
            x = x + 1;
        }

//        if (testOneFalied() || testTwoFailed()) {
//            System.out.println("test failed");
//            //Print out how many tests failed here
//        }


    }
}
