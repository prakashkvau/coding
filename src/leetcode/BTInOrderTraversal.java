package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    if (root == null) {
      return ret;
    }
    while (root != null) {
      if (root.left == null) {
        ret.add(root.val);
        root = root.right;
      } else {
        TreeNode predecessor = root.left;
        while (predecessor.right != null) {
          predecessor = predecessor.right;
        }
        predecessor.right = root;
        TreeNode temp = root;
        root = root.left;
        temp.left = null;
      }
    }
    return ret;
  }
}
