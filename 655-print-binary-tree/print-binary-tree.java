import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        int m = height + 1;
        int n = (int)Math.pow(2, m) - 1;

        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> row = new ArrayList<>(Collections.nCopies(n, ""));
            res.add(row);
        }

        fill(res, root, 0, (n - 1) / 2, height);
        return res;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    private void fill(List<List<String>> res, TreeNode node, int r, int c, int height) {
        if (node == null) return;
        res.get(r).set(c, Integer.toString(node.val));

        int offset = (int)Math.pow(2, height - r - 1);
        if (node.left != null) fill(res, node.left, r + 1, c - offset, height);
        if (node.right != null) fill(res, node.right, r + 1, c + offset, height);
    }
}
