package Lecture_12;

class Counter{
    private int count;
    private String name;

    public Counter(String name, int count){
        this.name = name;
        this.count = count;
        System.out.println("Counter " + name + " is initially " + count);
    }

    public Counter(String name){
        this(name, 0);
    }

    public Counter(Counter other){
        this(other.name, other.count);
    }
    public void countOne(){
        count+= 1;
        System.out.println("Counter " + name + " is now: " + count);
    }

    public void print(String handleName){
        System.out.println("RefName=" + handleName + ", ObjectName=" + name + ", count=" + count);
    }
}



public class ParameterPassing {
    public static void main(String[] args){
        Counter t = new Counter("T");
        t.countOne();
        t.countOne();

        Counter t2 = t; //The t2 object is just referencing t. It does not make a copy of t, just a copy of the reference
        t.print("t");
        t2.print("t2"); //Since t2 is pointing at the same object, They will have the same value
        t2.countOne(); //Even if you change t2, then you will be changing the original object as well
        t.print("t");
        t2.print("t2"); //You can see here the proof in the Object name, they are both referencing the T object.

        Counter t3 = new Counter(t); //This is copying the object and creating a new one
        t3.countOne();
        t3.countOne();
        t.print("t");
        t3.print("t3"); //It has the same object name because that was copied from t, but it has a
                        // different count because it is a physically different object.

        //----------------------------
        System.out.println("---------------------------"); // Spacer between examples
        //----------------------------
        Counter m = new Counter("M");
        int n = 0;
        method(n,m);
        System.out.println("n is: " + n); //n returns as 0 because the count was stuck in the method. and since
                                        // there is no return, the updated n was lost when the method closed
        m.print("m");           //but m stays counted because it updates the object, and when you refer to that
                                //reference, it is the updated reference.

        //----------------------------
        System.out.println("---------------------------"); // Spacer between examples
        //----------------------------
    }
    public static void method(int n, Counter m){
        n += 1;
        Counter tmp = m;
        tmp.countOne(); //updating m because tmp is copying the reference path to m, so m is still changing
        m.countOne();
    }
}
