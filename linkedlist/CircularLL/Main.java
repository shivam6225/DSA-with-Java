package CircularLL;


public class Main {

    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(25);
        list.insert(34);
        list.insert(890);
        list.insert(12);

        list.display();

        list.delete(34);

        list.display();

        list.delete(12);

        list.display();

        list.delete(25);

        list.display();
    }





}
