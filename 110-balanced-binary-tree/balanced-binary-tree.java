// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    // Helper function: returns height if balanced, -1 if not
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // left subtree not balanced

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // right subtree not balanced

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // current node not balanced

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
