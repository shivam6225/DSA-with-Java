package DoublyLL;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        if(head==null) {
            insertFirst(val);
            return;
        }

        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }

        Node node = new Node(val);
        ptr.next = node;
        node.prev = ptr;
        node.next = null;
    }

    public void insert(int val , int idx){
        if(idx==0) {
            insertFirst(val);
            return;
        }
        Node ptr = head;
        for(int i=1;i<idx;i++){
            ptr=ptr.next;
        }
        if(ptr!=null) {
            Node node = new Node(val, ptr.next, ptr);
            if (ptr.next != null)
                ptr.next.prev = node;
            ptr.next = node;
        }
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node node = head;
        Node last = node;
        while(node!=null){
            last=node;
            node = node.next;
        }

        while(last!=null){
            System.out.print(last.val+" <- ");
            last=last.prev;
        }

        System.out.println("START");
    }







    private class Node {
        int val;
        Node next;
        Node prev;


        public Node(int val) {
            this.val = val;
        }


        public Node(int val, DoublyLL.DLL.Node next, DoublyLL.DLL.Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
