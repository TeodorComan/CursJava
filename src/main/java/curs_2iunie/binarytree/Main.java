package curs_2iunie.binarytree;

public class Main {

    public static void main( String[] args ) {

        BinaryTree tree = new BinaryTree();

        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(6);
        tree.addNode(5);
        tree.addNode(4);
        tree.addNode(8);
        tree.addNode(7);
        tree.addNode(9);
        tree.addNode(3);
        tree.addNode(5);

        tree.inOrderTreeWalk(tree.getRoot());
    }
}
