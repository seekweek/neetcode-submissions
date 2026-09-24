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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
    //     if(p==null && q==null){
    //         return true;
    //     }

        

    //     if(p== null || q==null) return false;
    //    if(p.val!=q.val){
    //         return false;
    //     }
        
    //     return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
        List<Integer>li1=new ArrayList<>();

        List<Integer>li2=new ArrayList<>();

        preOrder(p,li1);
        preOrder(q,li2);

        return li1.equals(li2);

    }

    public static void preOrder(TreeNode P,List<Integer>a){
     if(P==null){
        a.add(null);
        return;
     }

     a.add(P.val);
     preOrder(P.left,a);
     preOrder(P.right,a);

    }
}
