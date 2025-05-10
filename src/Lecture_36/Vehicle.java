package Lecture_36;

public abstract class Vehicle {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public abstract void drive(int miles);
}
