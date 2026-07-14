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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        return ZZ(root,ans);
    }
    public List<List<Integer>> ZZ(TreeNode root,List<List<Integer>> ans)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean LTR=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                temp.add(node.val);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            if(!LTR)
            {
                Collections.reverse(temp);
            }
            ans.add(temp);
            LTR=!LTR;
        }
        return ans;

    }
}