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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        ans=inorder(root);
        return ans.get(k-1);
    }

    List<Integer> inorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        inorderHelper(root, ans);

        return ans;
    }

    void inorderHelper(TreeNode root, List<Integer> ans) {

        if (root == null) {
            return;
        }

        inorderHelper(root.left, ans);

        ans.add(root.val);

        inorderHelper(root.right, ans);
    }

}