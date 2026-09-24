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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         if (preorder.length == 0 || inorder.length == 0) return null;

        // Step 1: Root = preorder ka pehla element
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        // Step 2: Find root ka index inorder me
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        // Step 3: Left aur Right ka inorder/preorder arrays banao
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] rightInorder = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);

        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, 1 + leftInorder.length);
        int[] rightPreorder = Arrays.copyOfRange(preorder, 1 + leftInorder.length, preorder.length);

        // Step 4: Recursively call for left & right
        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
}
