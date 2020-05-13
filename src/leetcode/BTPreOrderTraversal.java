package leetcode;

import java.util.*;

public class BTPreOrderTraversal {
//  /**
//   * Recursive
//   * @param root
//   * @return
//   */
//  public List<Integer> preorderTraversal(SerializeDeserializeBinaryTree.TreeNode root) {
//    List<Integer> pre = new ArrayList<>();
//    if (root != null) {
//      pre.add(root.val);
//      pre.addAll(preorderTraversal(root.left));
//      pre.addAll(preorderTraversal(root.right));
//    }
//    return pre;
//  }

//  /**
//   * Iterative
//   *
//   * @param root
//   * @return
//   */
//  public List<Integer> preorderTraversal(TreeNode root) {
//    List<Integer> ret = new ArrayList<>();
//
//    if (root == null) {
//      return ret;
//    }
//    Deque<TreeNode> dq = new ArrayDeque<>();
//    dq.add(root);
//    while (!dq.isEmpty()) {
//      TreeNode node = dq.pollLast();
//      ret.add(node.val);
//      if (node.right != null) dq.add(node.right);
//
//      if (node.left != null) dq.add(node.left);
//    }
//    return ret;
//  }

  /**
   * Morris traversal
   *
   * @param root
   * @return
   */
  public List<Integer> preorderTraversal(TreeNode root) {
    LinkedList<Integer> output = new LinkedList<>();

    TreeNode node = root;
    while (node != null) {
      if (node.left == null) {
        output.add(node.val);
        node = node.right;
      } else {
        TreeNode predecessor = node.left;
        // find the right most element in the predecessor node.
        while ((predecessor.right != null) && (predecessor.right != node)) {
          predecessor = predecessor.right;
        }

        if (predecessor.right == null) {
          output.add(node.val);
          predecessor.right = node;
          node = node.left;
        } else {
          predecessor.right = null;
          node = node.right;
        }
      }
    }
    return output;
  }
}
