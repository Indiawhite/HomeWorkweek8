package inheritance1;
//Write a Java program to create a class called codeBuster with a method called
//groupName(). Create a subclass called codeBusterGroups() that overrides the
//groupName() method.

public class CodeBusterGroup extends CodeBuster {

    public void groupName(){

        System.out.println("CodeBusterGroups");
    }

    public static void main(String[] args) {
        CodeBusterGroup java = new CodeBusterGroup();
        java.groupName();
    }
}

