package DoublyLL;


public class Main {

    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(34);
        list.insertFirst(23);
        list.insertFirst(12);

        list.display();
        list.displayReverse();

        list.insertLast(100);
        list.insertLast(123);

        list.display();
        list.displayReverse();

        list.insert(129,2);
        list.insert(345,5);

        list.display();
        list.displayReverse();

        list.insert(239,8); //This shouldn't throw null pointer exception

        list.display();
        list.displayReverse();


    }
}
