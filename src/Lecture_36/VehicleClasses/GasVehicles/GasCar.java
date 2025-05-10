package Lecture_36.VehicleClasses.GasVehicles;

import Lecture_36.Interfaces.Fillable;
import Lecture_36.VehicleClasses.Car;
import Lecture_36.VehicleClasses.Tank;

public class GasCar extends Car implements Fillable {
    private Tank tank;
    public GasCar(){
        tank = new Tank();
    }
    @Override
    public void fill(double amount){
        tank.fill(amount);
    }
}
