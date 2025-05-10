package Lecture_36.VehicleClasses.GasVehicles;

import Lecture_36.VehicleClasses.Truck;
import Lecture_36.Interfaces.Fillable;
import Lecture_36.VehicleClasses.Tank;

public class GasTruck  extends Truck implements Fillable {
    private Tank tank;

    public GasTruck(){
        tank = new Tank();
    }

    @Override
    public void fill(double amount) {
        tank.fill(amount);
    }
}
