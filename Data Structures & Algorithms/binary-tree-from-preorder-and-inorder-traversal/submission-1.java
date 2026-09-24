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
    int preorderIndex = 0;  // preorder me kaunsa element use kar rahe hain track karne ke liye
    Map<Integer, Integer> inorderMap = new HashMap<>(); // inorder value -> index fast lookup

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Step 1: inorder array ke elements ka index hashmap me store karo
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        // Step 2: Recursively tree build karo
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        // Base case: agar left > right, koi subtree nahi hai
        if (left > right) return null;

        // Step 3: preorder ka current element root banega
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Step 4: inorder me root ka index find karo
        int rootIndex = inorderMap.get(rootVal);

        // Step 5: left subtree banate hain (left..rootIndex-1)
        root.left = build(preorder, left, rootIndex - 1);

        // Step 6: right subtree banate hain (rootIndex+1..right)
        root.right = build(preorder, rootIndex + 1, right);

        return root;
    }
}
