package Lecture_32;

public class Truck extends Vehicle {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void drive(int miles){
        super.drive(miles);
        System.out.println("This Truclk is driving");
        useFuel(miles / 10); //miles divided by fuel economy
    }
}
