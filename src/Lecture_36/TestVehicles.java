package Lecture_36;

import Lecture_32.GasTank;
import Lecture_36.Interfaces.Fillable;
import Lecture_36.VehicleClasses.GasVehicles.GasCar;
import Lecture_36.VehicleClasses.GasVehicles.GasTruck;
import Lecture_36.VehicleClasses.Tank;

import java.util.ArrayList;

public class TestVehicles {
    public static void fillAThing(Fillable f, double amount){
        f.fill(amount);
    }

    public static void main(String[] args) {
        ArrayList<Fillable> ft = new ArrayList<Fillable>();
        ft.add(new GasCar());
        ft.add(new GasTruck());
        ft.add(new Tank());

        for (Fillable f : ft){
            f.fill(10);
        }
    }
}
