package Lecture_36.VehicleClasses;

import Lecture_36.Interfaces.Fillable;

public class Tank implements Fillable {
    private double level;
    public void fill(double amount) {
        level += amount;
    }
}
