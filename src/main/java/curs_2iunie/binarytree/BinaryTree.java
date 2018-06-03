package curs_2iunie.binarytree;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addNode(int key) {
        root = addNode(root, key,null);
    }

    private Node addNode(Node subRoot, int key, Node parent) {

        if (subRoot == null) {
            return new Node(key,parent);
        }

        if (key >= subRoot.getKey()) {
            subRoot.setRight(addNode(subRoot.getRight(), key, subRoot));
        } else {
            subRoot.setLeft(addNode(subRoot.getLeft(), key, subRoot));
        }

        return subRoot;
    }

    public void inOrderTreeWalk(Node node) {
        if(node!=null) {

            inOrderTreeWalk(node.getLeft());
            System.out.println(node.getKey());
            inOrderTreeWalk(node.getRight());

        }
    }
}
