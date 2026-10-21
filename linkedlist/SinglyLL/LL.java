package SinglyLL;

import questions.ReverseLinkedList;

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

    //insert using recursion
    public void insertRecursion(int val,int idx){
        head = insertRecursion(val,idx,head);
    }

    private Node insertRecursion(int val , int index , Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val,index-1,node.next);

        return node;
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

    public void BubbleSort(){
        bubbleSort(size-1,0);
    }

    private void bubbleSort(int row , int col){

        if(row==0){
            return;
        }

        if(col<row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.val>second.val){
                if(first==head){
                    head = second;
                    first.next = second.next;
                    second.next=first;
                }

                else if(second==tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail=first;
                    first.next = null;
                    second.next = tail;
                }

                else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
           bubbleSort(row,col+1);
        }
        else{
            bubbleSort(row-1,0);
        }

    }

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    private Node reverseInPlace(){
        if(head==null||head.next==null) return head;
        Node prev = null;
        Node present = head;
        Node next = head.next;

        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next=next.next;
            }
        }

        return prev;
    }

    public void reverseBetween(Node head, int left, int right){
        if(left==right) return;

        //skip first left-1 nodes

        Node present = head;
        Node prev = null;

        for(int i=0;present!=null && i<left-1;i++){
            prev = present;
            present = present.next;
        }

        Node last = prev;
        Node newEnd = present;
        Node next = present.next;

        //reverse between left and right

        for(int i=0;i<(right-left+1) && present!=null ;i++){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next=next.next;
            }
        }

        if(last!=null){
            last.next=prev;
        }
        else{
            head = prev;
        }

        newEnd.next = present;

    }


}
