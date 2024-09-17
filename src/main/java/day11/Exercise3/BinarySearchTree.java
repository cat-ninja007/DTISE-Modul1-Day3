package day11.Exercise3;

// BinarySearchTree.java
public class BinarySearchTree {
    private TreeNode root;

    // Constructor to initialize the tree
    public BinarySearchTree() {
        this.root = null;
    }

    // Insert a new node into the BST
    public void insert(int data) {
        root = insertRec(root, data);  // Recursive insert method
    }

    // Recursive method to insert a node in the BST
    private TreeNode insertRec(TreeNode root, int data) {
        // Base case: If the tree is empty, create a new node
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Otherwise, recurse down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);  // Insert in left subtree
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);  // Insert in right subtree
        }

        // Return the unchanged node pointer
        return root;
    }

    // Search for a number in the BST
    public boolean search(int data) {
        return searchRec(root, data);  // Recursive search method
    }

    // Recursive method to search for a number in the BST
    private boolean searchRec(TreeNode root, int data) {
        // Base case: If the root is null or the data is found
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }

        // Recursively search in the left or right subtree
        if (data < root.data) {
            return searchRec(root.left, data);  // Search in left subtree
        }
        return searchRec(root.right, data);  // Search in right subtree
    }
}
