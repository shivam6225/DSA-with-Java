package SinglyLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(34);
        list.insertFirst(23);
        list.insertFirst(12);

        list.display();

        list.insertLast(78);
        list.insertLast(29);
        list.insertLast(190);

        list.display();

        list.insert(100,4);

        list.display();

        System.out.println(list.length());

        System.out.println(list.deleteFirst());

        list.display();
        System.out.println(list.length());

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(3));
        list.display();

        System.out.println(list.find(34));

        list.insertRecursion(22,2);
        list.display();

        System.out.println(list.length());

        list.BubbleSort();

        list.display();
    }
}
