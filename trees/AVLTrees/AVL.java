package AVLTrees;

import static java.util.Collections.rotate;

public class AVL {

    public AVL() {
    }

    private class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;


    private int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details) {

        if(node==null){
            return;
        }
        System.out.println(details+ node.getValue());

        display(node.left , "Left child of "+node.value + " : ");
        display(node.right , "Right child of "+node.value + " : ");
    }


    public void insert(int value){
//        if(root==null){
//            root.value = value;
//        }

        root = insert(root,value);
    }

    private Node insert(Node node, int value) {
        if(node==null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(node.left,value);
        }

        if(value > node.value){
            node.right = insert(node.right,value);
        }

        node.height = Math.max(height(node.left) , height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1) {
            //left heavy
            if(height(node.left.left) - height(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right)<0){
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right)<0){
                //right-right case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right)>0){
                //right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;

    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right))+1; //first p then c as p is below
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left),height(c.right))+1; //first c then p as c is below
        p.height = Math.max(height(p.left),height(p.right))+1;
        return p;
    }

    public boolean balanced() {

        return balanced(root);
    }

    private boolean balanced(Node node) {

        if(node==null){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node==null){
            return;
        }

        prettyDisplay(node.right,level+1);

        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);
        }
        else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left,level+1);

    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
}
