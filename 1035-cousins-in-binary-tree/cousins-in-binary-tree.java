// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false, foundY = false;
            TreeNode parentX = null, parentY = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                    if (node.left.val == x) {
                        foundX = true;
                        parentX = node;
                    }
                    if (node.left.val == y) {
                        foundY = true;
                        parentY = node;
                    }
                }

                if (node.right != null) {
                    queue.offer(node.right);
                    if (node.right.val == x) {
                        foundX = true;
                        parentX = node;
                    }
                    if (node.right.val == y) {
                        foundY = true;
                        parentY = node;
                    }
                }
            }

            // After processing one level
            if (foundX && foundY) {
                return parentX != parentY; // same depth, different parents
            }
            if (foundX || foundY) {
                return false; // only one found at this level
            }
        }
        return false;
    }
}
