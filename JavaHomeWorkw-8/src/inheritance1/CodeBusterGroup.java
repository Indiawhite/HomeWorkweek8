package inheritance1;

public class CodeBusterGroup extends CodeBuster {

    public void groupName(){

        System.out.println("CodeBusterGroups");
    }

    public static void main(String[] args) {
        CodeBusterGroup java = new CodeBusterGroup();
        java.groupName();
    }
}

