package Lecture_36.VehicleClasses;

import Lecture_36.Interfaces.Chargeable;

public class Battery implements Chargeable {
    private double level;
    public void charge(int amount){
        level += amount;
    }
}
