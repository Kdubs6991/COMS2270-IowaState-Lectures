/*package Lecture_26;
//Start of code to print out Ascii Art
//Professor did a lot of copy and paste, so I did not complete it


public class AsciiArt {

    private static boolean[][] getBlank(int numRows, int numCols) {
        //when this is created the default is false so we just return it
        boolean[][] blank = new boolean[numRows][numCols];
        return blank;
    }

    private static boolean[][] getP4(){
        boolean[][] pic = getBlank(stringP4.length, stringP4[0].length());
        for (int i = 0; i < stringP4.length; i++){
            for (int j = 0; j < stringP4[i].length(); j++){
                if (stringP4[i].charAt(j) == '0'){
                    pic[i][j] = true;
                } else {
                    pic[i][j] = false;
                }
            }
        }
        return pic;
    }

    public static void main(String[] args) {
        System.out.println("  /\\_/\\");
        System.out.println(" ( o.o )");
        System.out.println("  > ^ <");

        System.out.println(); /*Spacer for readability

    }
}
*/