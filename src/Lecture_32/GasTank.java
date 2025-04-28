package Lecture_32;

public class GasTank {
    private double gasLevel;

    public double getGasLevel(){
        return gasLevel;
    }

    public void addFuel(double amount){
        this.gasLevel += amount;
    }

    public void useFuel(double amount){
        this.gasLevel -= amount;
    }
}
