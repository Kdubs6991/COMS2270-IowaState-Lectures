package Lecture_14;

/**
 *Base price is price_per_item * items
 * regular shipping cost is SHIPPING_COST_PER_SHIRT * items
 * for orders over 25 or more shipping is free
 *
 * Tex is base price * TAX_RATE
 * No tax if in-state resident
 */

public class Order {
    public static final double PRICE = 10.0;
    public static final double SHIPPING_COST_PER_SHIRT = 2.0;
    public static final double TAX_RATE = 0.05;
    public static final int FREE_SHIPPING_THRESHOLD = 25;

    private int numShirts;
    private boolean isResident;

    //you can condense it more by setting the variables to 0 and just check if
    //the statement is false then if it is false apply the calculations.
    public double orderTotal(){
        double total = numShirts * PRICE;
        //calculates tax
        if (! isResident) {
            total += numShirts * PRICE * TAX_RATE;;
        }

        if (numShirts < FREE_SHIPPING_THRESHOLD) {
            total += numShirts * SHIPPING_COST_PER_SHIRT;
        }
        return total;
    }

    public static String getLetterGradeBad(int score){
        String letter = "";
        if (score >= 90){
            letter = "A";
        }else if (score >= 80 && score < 90){
            letter = "B";
        }else if (score >= 70 && score < 80){
            letter = "C";
        } else {
            letter = "F";
        }
        return letter;
    }


}

