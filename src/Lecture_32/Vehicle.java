package Lecture_32;

public class Vehicle {
    private int odometer;
    private String name;
    private GasTank gt = new GasTank();

    public void drive(int miles){
        if (miles > 0) {
            odometer += miles;
            System.out.print(name + " drove " + miles + " miles,");
            System.out.println(" and has an odometer reading of " + odometer);
        }
    }
    public void useFuel(double amount){
        gt.useFuel(amount);
    }

    public int getOdometer(){
        return odometer;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
