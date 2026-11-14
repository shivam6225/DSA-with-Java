package BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(15);
        bst.insert(5);
        bst.insert(10);
        bst.insert(20);
        bst.insert(24);
        bst.insert(18);
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        bst.insert(3);


        bst.display();
        System.out.println(bst.balanced());

        bst.prettyDisplay();

        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
    }
}
