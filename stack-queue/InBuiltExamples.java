import java.util.*;

public class InBuiltExamples {
    //pop - O(1) push O(1)
    //add - O(1) remove O(1)
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(23);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.lastElement());
        System.out.println(stack.peek());
        System.out.println(stack.firstElement());
        System.out.println(stack.getFirst());

        System.out.println(stack.search(45));

        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(45);
        queue.add(12);
        queue.add(90);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        Deque<Integer> deque = new ArrayDeque<>();

        //ArrayDeque -> create an object that are mentioned in Deque ->
        // implements the methods , it has resizable array

        deque.add(45);
        deque.add(23);

        System.out.println(deque.poll());
        System.out.println(deque.peek());

        deque.addFirst(34);

        System.out.println(deque.poll());
        System.out.println(deque.peek());

        deque.addLast(10);

        System.out.println(deque.poll());
        System.out.println(deque.peek());

        System.out.println(deque.getLast());



    }
}
