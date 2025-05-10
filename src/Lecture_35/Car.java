package Lecture_35;

public class Car extends Vehicle{
    @Override
    public void drive(int miles) {
        System.out.println("This car is driving");
    }

    @Override
    public void fill(double gallons) {
        System.out.println("Filling with " + gallons + " gallons");
    }

    @Override
    public void steer(int degrees) {
        System.out.println("This Car is steering");
    }
}
