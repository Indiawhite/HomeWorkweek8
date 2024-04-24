package inheritance9;
//Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panther. Override the move() method
//in each subclass to describe how each animal moves. Also, override the makeSound()
//method in each subclass to make a specific sound for each animal.

public class Bird1 extends Animal1 {

    public void move(){
        System.out.println("animal move in the Jungle ");
    }
    public void makeSound(){
        System.out.println("Bird sound like chrips chrips");
    }

    public static void main(String[] args) {
        Bird1 b = new Bird1();
        b.move();
        b.makeSound();
    }

}
