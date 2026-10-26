

public class QueueMain{

    public static void main(String[] args) throws QueueException {
//        CustomQueue queue = new CustomQueue(5);
//
//        queue.insert(45);
//        queue.insert(20);
//        queue.insert(12);
//        queue.insert(29);
//        queue.insert(10);
//        queue.insert(14);
//
//        System.out.println(queue.peek());
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        CircularQueue queue = new CircularQueue(5);

        queue.insert(45);
        queue.insert(20);
        queue.insert(12);
        queue.insert(29);
        queue.insert(10);


        System.out.println(queue.peek());
        queue.display();

        System.out.println(queue.remove());
        queue.display();
        queue.insert(17);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());


        DynamicQueue q2 = new DynamicQueue(5);

        q2.insert(45);
        q2.insert(20);
        q2.insert(12);
        q2.insert(29);
        q2.insert(10);

        q2.display();

        q2.insert(100);
        q2.display();

    }
}
