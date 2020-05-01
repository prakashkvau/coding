package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }
        Node clone = new Node(node.val, new ArrayList());
        visited.put(node, clone);
        for (Node neigh : node.neighbors) {
            clone.neighbors.add(cloneGraph(neigh));
        }

        return clone;
    }

    public static void main(String[] args) {
        CloneGraph cg = new CloneGraph();
        Node main = new Node(1);

        List<Node> neigh = new ArrayList<>();
        neigh.add(new Node(2));
        neigh.add(new Node(3));
        main.neighbors = neigh;

        System.out.println(cg.cloneGraph(main));
    }
}