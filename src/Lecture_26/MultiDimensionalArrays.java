package Lecture_26;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Creates a 2D array
        int[][] data = {
                {2, 3, 5, 7},   //row 1
                {3, 2, 9, 1},   //row 2
                {4, 5, 6, 2}    //row 3
        };

        int[] rowSums = new int [data.length];
        int[] colSums = new int [data[0].length];
        int total = 0;

        //for loop to add up the row and column sums as well as total
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                rowSums[i] += data[i][j];
                colSums[j] += data[i][j];
                total += data[i][j];
            }
        }

        //Print out the row Sums
        for (int i = 0; i < rowSums.length; i++){
            System.out.println("Row sum [" + i + "]: " + rowSums[i] + " ");
        }
        System.out.println(); /*Spacer for readability*/
        //Print out the column Sums
        for (int i = 0; i < colSums.length; i++){
            System.out.println("Column sum [" + i + "]: " + colSums[i] + " ");
        }
        System.out.println(); /*Spacer for readability*/
    }
}
