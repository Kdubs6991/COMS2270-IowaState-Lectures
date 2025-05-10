package Lecture_35;

import java.util.ArrayList;

public class TestVehicle {
    public static void driveDistance(Vehicle v, int distance){
        v.drive(distance);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        Truck myTruck = new Truck();
        //Vehicle myVehicle = new Vehicle(); abstact, cannot instantiate

        Vehicle myVehicle = new Car();
        driveDistance(myVehicle, 20);
        Vehicle myVehicle2 = new Truck();
        driveDistance(myVehicle2, 20);
        /////////////////////////////
        System.out.println(); /*Spacer for readability*/
        /////////////////////////////
        ArrayList<Vehicle> ml = new ArrayList<Vehicle>();
        ml.add(myCar);
        ml.add(myTruck);
        for (Vehicle v : ml){
            driveDistance(v, 20);
        }
    }
}
