public class StackMain {

    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);

        stack.push(45);
        stack.push(10);
        stack.push(34);
        stack.push(23);
        stack.push(10);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
