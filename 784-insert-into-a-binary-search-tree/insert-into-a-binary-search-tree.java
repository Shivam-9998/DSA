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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ans=new TreeNode(val);
        if (root == null)
    return new TreeNode(val);
        TreeNode curr=root;
        while(((val>curr.val)&&(curr.right!=null)) || (val<curr.val)&&(curr.left!=null))
        {
            if(val>curr.val)
            {
                curr=curr.right;
            }
            else
            {
                curr=curr.left;
            }
        }
        if(curr.val>val)
        {
            curr.left=ans;
        }
        else
        {
            curr.right=ans;
        }
        return root;
    }
}