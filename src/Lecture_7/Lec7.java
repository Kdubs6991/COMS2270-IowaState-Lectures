package Lecture_7;

class BadString{
    private String myStr;

    public String getString(){
        return myStr;
    }
}

public class Lec7 {
    public static void main (String[] args){
        BadString eg = new BadString();
        System.out.println(eg.getString().length());
    }
}
