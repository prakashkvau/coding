package datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyBinaryTree {
    BinaryTree root;
    class BinaryTree {
        int data;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int i) {
            this.data = i;
        }

        BinaryTree() {

        }
    }

    public void add(int i) {
        BinaryTree b = new BinaryTree(i);
        if (root == null) {
            root = b;
        } else {
            BinaryTree temp = root;
            // traverse and to find empty node
            while(temp.left != null && temp.right != null) {
                    temp = temp.left;
            }

            if (temp.left == null) {
                temp.left = b;
            } else {
                temp.right = b;
            }
        }
    }

    public void delete(BinaryTree root) {
        if (root == null) {
            return;
        }
        delete(root.left);
        delete(root.right);
        root = null;
    }

    public void printDFS(BinaryTree root) {
        Stack<BinaryTree> s = new Stack<>();
        BinaryTree temp = root;

        while(!s.isEmpty() || temp != null) {
            while(temp!=null) {
                s.push(temp);
                temp = temp.left;
            } 

            temp = s.pop();
            System.out.println(temp.data);
            temp = temp.right;
        }
    }

    public void printBFS(BinaryTree root) {
        Queue<BinaryTree> s = new LinkedList<>();
        BinaryTree temp = root;
        s.add(temp);
        while(!s.isEmpty()) {
            BinaryTree i = s.poll();
            System.out.println(i.data);

            if (i.left !=null) {
                s.add(i.left);
            }
            if (i.right!=null) {
                s.add(i.right);
            }
        }
    }

    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(5);
        myBinaryTree.add(10);
        System.out.println("here");
        myBinaryTree.printBFS(myBinaryTree.root);
    }
}
