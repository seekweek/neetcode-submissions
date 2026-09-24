/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */



class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
        rightSide(root, rightView, 0); // start from level 0
        return rightView;
    }

    public static void rightSide(TreeNode root, List<Integer> arr, int level) {
        if (root == null) {
            return;
        }

        // If we're at a new level, add the first node we encounter
        if (level == arr.size()) {
            arr.add(root.val);
        }

        // Visit right first, then left
        rightSide(root.right, arr, level + 1);
        rightSide(root.left, arr, level + 1);
    }
}
