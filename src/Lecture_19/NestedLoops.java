package Lecture_19;

public class NestedLoops {
    public static boolean hasDuplicate(String txt) {
        boolean dup = false;
        int i;
        int j;
        outerloop:
        for (i = 0; !dup && i < txt.length(); ++i) {
            for (j = i + 1; !dup && j < txt.length(); ++j) {
                if (txt.charAt(i) == txt.charAt(j)) {
                    dup = true;
                }
            }
        }
        return dup;
    }

    public static int indexOf(String text, String sub){
        int index = -1;

        int i;
        int j;
        for (i = 0; i <= text.length(); ++i){
            j = 0;
            while (j < sub.length() && i + j < text.length() && text.charAt(i + j) == sub.charAt(j)){
                ++j;
            }
            if (j == sub.length()){
                index = i;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        char letter1 = 'a';
        while (letter1 <= 'c') {
            char letter2 = 'a';
            while (letter2 <= 'c'){
                System.out.println("" + letter1 + letter2 + ".com");
                letter2++;
            }
            letter1++;
        }
        System.out.println();
        //

        for (letter1 = 'a'; letter1 <= 'c'; ++letter1){
            for (char letter2 = 'a'; letter2 <= 'c'; ++letter2){
                System.out.println("" + letter1 + letter2 + ".com");
            }
        }
        System.out.println();

        System.out.println(hasDuplicate("pear"));
        System.out.println(hasDuplicate("apple"));

        System.out.println();

        System.out.println(indexOf("lighhouses", "sesame"));
    }
}
