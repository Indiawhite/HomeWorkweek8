package inheritance4;
//Write a Java program to create a class called Animal with a method named move().
//Create a subclass called Cheetah that overrides the move() method to run.

public class Cheetah extends Animal {
    public void move(){
        System.out.println("Cheetah is running fast");
    }

    public static void main(String[] args) {
        Cheetah a =new Cheetah();
        a.move();
    }
}
