package inheritance6;

public class Cat extends AnimalFamily{
    public void sound (){
        System.out.println("cat sound like meow meow");
    }

    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.sound();
    }
}

