package Lecture_18;

public class ForLoops {
    public static int countPs(String str){
        int count = 0;
        for (int i = 0; i < str.length(); ++i){
            if (str.charAt(i) == 'p' || str.charAt(i) == 'P'){
                ++count;
            }
        }
        return count;
    }

    public static String reverse (String str){
        String ans = "";
        for (int i = str.length() - 1; i >= 0; --i){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static boolean hasDoubleLetter(String str){
        for (int i = 0; i < str.length() - 1; ++i){
            if (str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; ++i) { //decalring in the for loop causes
            System.out.println(i);      //it to only exist in the for loop
        }
        //System.out.println(i); i only exists in the for loop

        System.out.println(countPs("apple"));
        System.out.println(reverse("apple"));
        System.out.println(hasDoubleLetter("apple"));
    }
}
