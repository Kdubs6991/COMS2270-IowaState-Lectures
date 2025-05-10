package Lecture_35;

public interface Fillable {
    //don't need to specify public because everything is public automatically
    void fill(double gallons);
}

class MyClass implements Fillable {
    private double level;
    @Override
    public void fill(double gallons) {
        System.out.println("Filling with " + gallons + " gallons");
        level += gallons;
    }
}
