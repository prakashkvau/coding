package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ClonedGraphBFS {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }
        HashMap<Node, Node> visited = new HashMap();
        Queue<Node> q = new LinkedList<Node>();
        q.offer(node);
        visited.put(node, new Node(node.val, new ArrayList<>()));

        while (!q.isEmpty()) {
            Node r = q.remove();
            for (Node nei : r.neighbors) {
                if (!visited.containsKey(nei)) {
                    q.offer(nei);
                    visited.put(nei, new Node(nei.val, new ArrayList<>()));
                }

                visited.get(r).neighbors.add(visited.get(nei));
            }
        }

        return visited.get(node);
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