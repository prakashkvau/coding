package datastructures;

public class MyGenericTree {
    GenericTree root;

    class GenericTree {
        Integer data;
        GenericTree child;
        GenericTree nextChild;

        GenericTree(int i) {
            this.data = i;
        }

        GenericTree() {

        }
    }

    public void add(int i) {
        GenericTree genericTree = new GenericTree(i);
        GenericTree temp = root;
        if (temp == null) {
            root = genericTree;
            return;
        }

        while(temp.child != null && temp.nextChild !=null) {
                temp = temp.child;
        }

        if (temp.child == null) {
            temp.child = genericTree;
        } else if (temp.nextChild == null) {
            temp.nextChild = genericTree;
        } else {
            System.out.println("not null");
        }
        root = temp;
        return;
    }

    public void print(GenericTree root) {
        if (root == null) {
            return;
        }
        print(root.child);
        print(root.nextChild);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        MyGenericTree myGenericTree = new MyGenericTree();
        myGenericTree.add(4);
        myGenericTree.add(10);
        myGenericTree.add(18);
        myGenericTree.add(20);
        myGenericTree.print(myGenericTree.root);
        System.out.println("result");
    }
}
