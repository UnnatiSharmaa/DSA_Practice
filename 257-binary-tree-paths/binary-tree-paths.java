// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node == null) return;

        // Build current path
        path += node.val;

        // If leaf node → add path
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            // Continue DFS with children
            dfs(node.left, path + "->", paths);
            dfs(node.right, path + "->", paths);
        }
    }
}
