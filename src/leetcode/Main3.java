package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    /*
    Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    Example 1:
    Input: p = [1,2,3], q = [1,2,3]
    Output: true

    Example 2:
    Input: p = [1,2], q = [1,null,2]
    Output: false

    Example 3:
    Input: p = [1,2,1], q = [1,1,2]
    Output: false

    https://leetcode.com/problems/same-tree/description/

     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));

//        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(1, null, null));
//        TreeNode treeNode2 = new TreeNode(1, new TreeNode(1, null, null), new TreeNode(2, null, null));

//        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, null), null);
//        TreeNode treeNode2 = new TreeNode(1, null, new TreeNode(2, null, null));

        boolean result = isSameTree(treeNode1, treeNode2);
        System.out.println(result);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}