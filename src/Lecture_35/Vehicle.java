package Lecture_35;

public abstract class Vehicle implements Steerable, Fillable {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public abstract void drive(int miles);
}
