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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
         dfs(root,targetSum,ans,new ArrayList<>(),0);
         return ans;

    }
    void dfs(TreeNode root, int targetsum, List<List<Integer>> ans,List<Integer> temp,int tg){
        if(root==null) return;
        tg+=root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null && targetsum==tg){
            ans.add(new ArrayList<>(temp));
            


        }
        dfs(root.left,targetsum,ans,temp,tg);
         dfs(root.right,targetsum,ans,temp,tg);
        temp.remove(temp.size()-1);

    }
}