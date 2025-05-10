package Lecture_36.VehicleClasses;

import Lecture_36.Vehicle;

public class Car extends Vehicle {
    @Override
    public void drive(int miles) {
        System.out.println("This Car is driving");
    }
}
