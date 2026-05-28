package org.leetcode.binarysearchtree;

public class TreeNode {

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

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;

    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(3,null,null);
        node.left = new TreeNode(9,null,null);
        node.right = new TreeNode(20,null,null);
        node.right.right = new TreeNode(15,null,null);

        int _maxDepth = node.maxDepth(node);
        System.out.println(_maxDepth);
    }
}
