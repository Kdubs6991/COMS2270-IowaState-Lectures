package Lecture_35;

public class Truck extends Vehicle{

    @Override
    public void drive(int miles) {
        System.out.println("This Truck is driving");
    }

    @Override
    public void steer(int degrees) {
        System.out.println("This Truck is steering");
    }

    @Override
    public void fill(double gallons) {
        System.out.println("Filling with " + gallons + " gallons");
    }
}
