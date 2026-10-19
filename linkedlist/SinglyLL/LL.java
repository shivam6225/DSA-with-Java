package SinglyLL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;


        public Node(int val) {
            this.val = val;
        }


        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int idx){
        if(idx==0) {
            insertFirst(val);
            return;
        }
        if(idx==size-1){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i=1;i<idx;i++){
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;

        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }



    public int deleteLast(){
        if(size<=1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);

        int val = tail.val;

        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int idx){
        if(idx==0) {
            return deleteFirst();
        }
        if(idx==size-1){
            return deleteLast();
        }

        Node prev = get(idx-1);

        int val = prev.next.val;

        prev.next = prev.next.next;
        size--;
        return val;

    }

    public void display(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.val+" -> ");
            ptr = ptr.next;
        }
        System.out.println("END");
    }


    public int length(){
        return size;
    }
}
