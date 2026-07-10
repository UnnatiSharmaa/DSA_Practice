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
    private int totalTilt = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return totalTilt;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        // Recursively calculate sum of left and right subtrees
        int leftSum = dfs(node.left);
        int rightSum = dfs(node.right);

        // Tilt of current node
        totalTilt += Math.abs(leftSum - rightSum);

        // Return sum of subtree rooted at current node
        return node.val + leftSum + rightSum;
    }
}
