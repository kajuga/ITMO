package Arrays;

public class BinaryTreeSimple {
    Node root;

    //..

    private Node addREcursive(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }
        if(value < current.value) {
            current.left = addREcursive(current.left, value);
        }
        else if(value > current.value) {
            current.right = addREcursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addREcursive(root, value);
    }


    private BinaryTreeSimple createBinaryTree() {
        BinaryTreeSimple bt = new BinaryTreeSimple();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if(value == current.value) {
            return true;
        }
        return value < current.value ?
                containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }


    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

//    int smallestValue = findSmallestValue(current.right);
//    current.value = smallestValue;
//    current.right = deleteRecursive(current.right, smallestValue);
//return current;

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }











}

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }






