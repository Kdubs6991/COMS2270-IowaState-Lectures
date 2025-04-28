package Lecture_34;

import java.util.ArrayList;

class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void walk(){
        System.out.println("Animal " +name + " is walking");
    }
}

class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public void walk(){
        System.out.println("Dog " + getName() + " is walking");
    }
    public void bark(){
        System.out.println("Dog " + getName() + " is barking");
    }
}

class Boxer extends Dog {
    public Boxer(String name){
        super(name);
    }

    @Override
    public void walk(){
        System.out.println("Boxer " + getName() + " is walking");
    }
    @Override
    public void bark(){
        System.out.println("Boxer " + getName() + " is barking");
    }
}

class Beagle extends Dog {
    public Beagle(String name){
        super(name);
    }

    @Override
    public void walk(){
        System.out.println("Beagle " + getName() + " is walking");
    }
    @Override
    public void bark(){
        System.out.println("Beagle " + getName() + " is barking");
    }
}

class Car {
    private String name;
    public Car (String name){
        this.name = name;
    }
}
//public class for testing
public class PolymorphismEtc {
    public static void walkDog(Dog d){
        System.out.println("Dog " + d.getName() + " is walking");
        d.walk();
        d.bark();
    }

    public static void main(String[] args) {
        Animal myPet = new Animal("Simon");
        myPet.walk();
        System.out.println(); /*Spacer for readability*/
        Dog myDog = new Dog("Peter");
        myDog.walk();
        myDog.bark();
        System.out.println(); /*Spacer for readability*/
        Boxer myBoxer = new Boxer("Tomas");
        myBoxer.walk();
        myBoxer.bark();
        System.out.println(); /*Spacer for readability*/
        Beagle myBeagle = new Beagle("Judas");
        myBeagle.walk();
        myBeagle.bark();
        System.out.println(); /*Spacer for readability*/

        Animal myPet2 = new Dog("Brownie");
        myPet2.walk();
        // myPet2.bark(); //Doesn't compile
        ((Dog) myPet2).bark(); //down casting
        if (myPet2 instanceof Dog){ //safer because if statement won't break program
            ((Dog) myPet2).bark(); //safer downcast
        }
        //((Dog) myPet).bark(); //doesn't work because type of Animal isn't dog

        Animal myPet3 = (Animal) new Dog("Max");//upcasting is not necessary

        Beagle myBeagle2 = new Beagle("Judas");
        //((Boxer) myBeagle2).bark(); can't cast "sideways"

        ArrayList<Dog> dl = new ArrayList<Dog>();
        dl.add(myBoxer);
        dl.add(myBeagle);
        dl.add((Dog) myPet2);

        for (Dog d : dl){
            d.bark();
            walkDog(d);
        }
        ////////////////////////

        Car myCar = new Car("Mustang");
        Car benz = null;

        System.out.println(); /*Spacer for readability*/

        System.out.print("myPet instanceof Animal: ");
        System.out.println(myPet instanceof Animal);
        System.out.print("myDog instanceof Dog: ");
        System.out.println(myDog instanceof Dog);
        System.out.print("myDog instanceof Animal: ");
        System.out.println(myDog instanceof Animal);
        System.out.print("benz instanceof Car: ");
        System.out.println(benz instanceof Car);

        System.out.print("myPet.getClass() == Animal.class: ");
        System.out.println(myPet.getClass() == Animal.class);
        System.out.print("myDog.getClass() == Dog.class: ");
        System.out.println(myPet.getClass() == Dog.class);
        // Can't compare Dog to Animal because compiler knows they will never be the same (upcast)
        //System.out.print("myDog.getClass() == Animal.class: ");
        //System.out.println(myDog.getClass() == Animal.class);

    }
}