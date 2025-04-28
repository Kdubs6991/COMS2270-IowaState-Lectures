package Lecture_32;

public class Car extends Vehicle {
    private int seats;

    public Car(){
        this.setName("Hyundai Sonata");
        //name = "Hyundai Sonata"; *Doesn't work because it's a private variable in a super class
    }

    public int getSeats(){
        return seats;
    }

    public void setSeats(int newSeats){
        this.seats = newSeats;
    }

    @Override
    public void drive(int miles){
        super.drive(miles);
        System.out.println("This car is driving");
        useFuel(miles / 30); //miles divided by fuel economy
    }
}
