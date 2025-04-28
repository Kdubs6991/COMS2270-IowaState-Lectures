package Lecture_4;

public class PlanetsEtc {

    public static void printPlanetInfo(double radius, String name){
        System.out.println("The volume of " + name + " is " + MyMath.findVolume(radius) + " cubic miles.");
        System.out.println("The surface area of " + name + " is " + MyMath.findSurfactArea(radius) + " square miles.");

    }

    public static void main(String[] args) {

        double earthRadius = 3959.0; //miles
        String earthName = "Earth";
        printPlanetInfo(earthRadius, earthName);

        double mercuryRadius = 3760.0; //miles
        String mercuryName = "Mercury";
        printPlanetInfo(mercuryRadius, mercuryName);
    }
}
