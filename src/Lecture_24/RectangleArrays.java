package Lecture_24;
import java.awt.Rectangle;
import java.util.Arrays;

public class RectangleArrays {
    public static void main(String[] args) {
        Rectangle[] rects = new Rectangle[2];
        //When Array are first created, the initial value is null
        System.out.println(rects[0]);

        rects[0] = new Rectangle(5, 10);
        rects[1] = new Rectangle(100, 100);
        System.out.println(rects[0]);

        System.out.println(); //spacer for readability

        //we tell the copyOf what array to copy, and how much of it (length)
        Rectangle[] copied = Arrays.copyOf(rects, rects.length);
        System.out.println(copied[0].getWidth());
        rects[0].grow(10, 10); //makes it 10 wider and 10 taller
        System.out.println(copied[0].getWidth());
        //because they share references, when we change the original,
        //the copy points to the changed one as well. which is what we did above

        System.out.println(); //spacer for readability

        Rectangle[] deepcopy = new Rectangle[rects.length];
        for (int i = 0; i < rects.length; ++i){
            deepcopy[i] = new Rectangle(0, 0,(int) rects[i].getWidth(), (int) rects[i].getHeight());
            System.out.println(deepcopy[i]);
        }

    }
}
