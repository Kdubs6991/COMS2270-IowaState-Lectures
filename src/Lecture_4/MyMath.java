package Lecture_4;

public class MyMath {
    public static double findVolume(double radius){
        String name = "Earth";
        double volume = 4.0/3 * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public static double findSurfactArea(double radius){
        double area = 2 * Math.PI * radius * radius;
        return area;
    }
}
