package AbstractClasses;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(25);
        son.career("Doctor");

        Parent daughter = new Daughter(23);
        daughter.career("Engineer");

        //Parent mom = new Parent() ; -> Object can't be created for Parent Classes

        Parent.hello();
    }
}
