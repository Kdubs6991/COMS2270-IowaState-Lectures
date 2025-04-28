package Lecture_6;

/**
 * @author Kaleb Wrigley
 * @version 0.1
 */

public class CashRegister {
    private double subTotal;
    private double taxRate;
    /**
     * This is our default constructor
     * which sets things up
     */
    public CashRegister(){
        subTotal = 0.0;
        taxRate = 0.07; //only works for iowa
    }
    /**
     * This scans one item and creates a beep
     * The input is the price of the item scanned
     * @param price is the price of the item scanned
     */

    public void addNonTaxableItem(double price){
        //mutator
        subTotal = subTotal + price;
    }
    public void addTaxableItem(double price){
        subTotal = subTotal + price + price*taxRate;
    }

    /**
     * This tells you the running total we have
     * scanned so far
     * @return The running total
     */
    public double getTotal(){
        //an accessor
        return subTotal;
    }
    public double getFinalTotal(){
        return 0;
    }
    public double getTax(){
        return 0;
    }
    public double getTaxRate(){
        return taxRate;
    }
}
