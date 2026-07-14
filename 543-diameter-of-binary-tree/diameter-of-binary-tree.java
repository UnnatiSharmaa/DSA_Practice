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
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    // Helper function to calculate depth
    private int depth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Update diameter: longest path through this node
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return height of subtree
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
