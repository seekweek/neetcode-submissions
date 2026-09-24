

class Solution {
    private int reSult; // global variable

    public int maxPathSum(TreeNode root) {
        reSult = Integer.MIN_VALUE;  // initialize
        MaxSumTree(root);
        return reSult;
    }

    // Recursive function
    private int MaxSumTree(TreeNode root) {
        if (root == null) return 0;

        int left = MaxSumTree(root.left);
        int right = MaxSumTree(root.right);

        // Ignore negative paths
        left = Math.max(left, 0);
        right = Math.max(right, 0);

        // Update global maximum
        reSult = Math.max(reSult, root.val + left + right);

        // Return max gain to parent
        return root.val + Math.max(left, right);
    }
}
