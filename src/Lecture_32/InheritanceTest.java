package Lecture_32;

public class InheritanceTest {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setName("toyota corolla");
        System.out.println(myCar.getName());
        myCar.drive(100);
        myCar.setSeats(6);

        System.out.println(); /*Spacer for readability*/

        Truck myTruck = new Truck();
        myTruck.setName("Ford F-150");
        System.out.println(myTruck.getName());
        myTruck.drive(1000);
        myTruck.setWeight(1500); //lbs
    }
}
