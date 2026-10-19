package CircularLL;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);

        if(head==null){
            head=node;
            tail=node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.val+"->");
                node = node.next;
            }while(node!=head);
            System.out.println("END");
        }

    }

    public void delete(int val) {
        if (head == null) {
            return;
        }

        // Case 1: Only 1 node in the list
        if (head == tail) {
            if (head.val == val) {
                head = null;
                tail = null;
            }
            return;
        }

        // Case 2: Deleting head (list has 2 or more nodes)
        if (head.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        // Case 3: Deleting middle node or tail
        Node ptr = head;
        while (ptr.next != head) {
            if (ptr.next.val == val) {
                // If the node to delete is the tail, move tail pointer backward
                if (ptr.next == tail) {
                    tail = ptr;
                }
                ptr.next = ptr.next.next;
                return;
            }
            ptr = ptr.next;
        }
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
