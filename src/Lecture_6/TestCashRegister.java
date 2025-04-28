package Lecture_6;

public class TestCashRegister {
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();

        cr.addNonTaxableItem(5.00);
        System.out.printf("The total scanned should be 5.00 -- it is actually:" +
                " %5.2f%n", cr.getTotal());
        cr.addNonTaxableItem(2.00);
        System.out.printf("The total scanned should be 7.00 -- it is actually:" +
                " %5.2f%n", cr.getTotal());

        CashRegister cr2 = new CashRegister();
        cr2.addTaxableItem(5.99);
        System.out.printf("The total scanned should be 6.41 -- it is actually: " +
                " %5.2f%n", cr2.getTotal());

    }
}
