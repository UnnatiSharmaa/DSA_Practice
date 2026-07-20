// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: empty tree or found the node
        if (root == null || root.val == val) return root;

        // If val is smaller → search left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        } 
        // If val is larger → search right subtree
        else {
            return searchBST(root.right, val);
        }
    }
}
