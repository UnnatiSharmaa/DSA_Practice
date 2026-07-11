// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return dfs(root, root.val);
    }

    private boolean dfs(TreeNode node, int value) {
        if (node == null) return true;

        // If current node value differs → not uni-valued
        if (node.val != value) return false;

        // Recursively check left & right
        return dfs(node.left, value) && dfs(node.right, value);
    }
}
