// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                // Visit node
                detect(curr);
                curr = curr.right;
            } else {
                TreeNode pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    pre.right = null;
                    detect(curr);
                    curr = curr.right;
                }
            }
        }
        // Swap values of the two wrong nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void detect(TreeNode node) {
        if (prev.val > node.val) {
            if (first == null) first = prev;
            second = node;
        }
        prev = node;
    }
}
