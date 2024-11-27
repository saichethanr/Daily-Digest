package trees;


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

public class longest_univalued_path {
    private int maxl = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return maxl;

    }
        private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
       
        int lp = dfs(node.left);
        int rp = dfs(node.right);

        
        int leftExtension = (node.left != null && node.left.val == node.val) ? lp + 1 : 0;
        int rightExtension = (node.right != null && node.right.val == node.val) ? rp + 1 : 0;

        
        maxl = Math.max(maxl, leftExtension + rightExtension);

        
        return Math.max(leftExtension, rightExtension);
    }
}
