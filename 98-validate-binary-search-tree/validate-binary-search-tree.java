// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long min, long max) {
        if (node == null) return true;

        // Node value must be strictly between min and max
        if (node.val <= min || node.val >= max) return false;

        // Recursively validate left and right subtrees
        return helper(node.left, min, node.val) &&
               helper(node.right, node.val, max);
    }
}
