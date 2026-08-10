// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private TreeNode curr;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1); // temporary node
        curr = dummy;
        inorder(root);
        return dummy.right; // new root
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // Rearrange pointers
        node.left = null;     // no left child
        curr.right = node;    // attach to the right
        curr = node;          // move pointer

        inorder(node.right);
    }
}
