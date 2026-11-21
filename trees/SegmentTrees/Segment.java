package SegmentTrees;

public class Segment {

    private class Node {
        int data;
        int startInterval ;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public Segment(int[] arr){
        //create a tree using this array
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start==end){
            //We are in leaf Node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        //create new node with index you are at
        Node node = new Node(start,end);
        int mid = (start+end)/2;

        //construct left and right node
        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node) {

        String str="";
        if(node.left!=null){
            str = str+ "Interval=[" + node.left.startInterval + "-" +
                    node.left.endInterval+"] and data: "+node.left.data +" =>";
        }
        else{
            str=str+"No left child";
        }

        //for current Node
        str = str+ " Interval=[" + node.startInterval + "-" +
                node.endInterval+"] and data: "+node.data +" <=";


        if(node.right!=null){
            str = str+ " Interval=[" + node.right.startInterval + "-" +
                    node.right.endInterval+"] and data: "+node.right.data ;
        }
        else{
            str=str+"No right child";
        }

        System.out.println(str+"\n");

        //call recursion
        if(node.left!=null){
            display(node.left);
        }

        if(node.right!=null){
            display(node.right);
        }
    }

    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }

    private int query(Node node, int qsi, int qei) {
        if(node.startInterval >=qsi && node.endInterval<=qei){
            //node is completely lying inside query
            return node.data;
        }
        else if(node.endInterval < qsi || node.startInterval > qei){
            //completely outside
            return 0;
        }
        else {
            return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
        }
    }

    public void update(int idx,int val){
        this.update(root, idx, val);
    }

    private int update(Node node, int idx, int val) {
        if(idx>=node.startInterval && idx<=node.endInterval){
            //Index lies in interval
            if(idx==node.startInterval && idx==node.endInterval){
                //update value when at leaf node
                node.data = val;
                return node.data;
            }
            else{
                //update the data value of affected node
                int leftA = update(node.left,idx,val);
                int rightA = update(node.right,idx,val);

                node.data = leftA+rightA;
                return node.data;
            }
        }
        else{
            //do nothing just return unchanged
            return node.data;
        }
    }


}
