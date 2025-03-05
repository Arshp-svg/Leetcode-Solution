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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>  sortedEle=new ArrayList<>();
        inorder(root, sortedEle);
        return BuildTree( sortedEle,0,sortedEle.size()-1);
    }
    void inorder(TreeNode root,List<Integer> sortedEle){
        if(root==null) return ;
        inorder(root.left, sortedEle);
         sortedEle.add(root.val);
         inorder(root.right, sortedEle);
    }
    TreeNode BuildTree(List<Integer> Elements,int start,int end)
    {
        if(start>end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node=new TreeNode(Elements.get(mid));
       node.left= BuildTree( Elements,start,mid-1);
        node.right= BuildTree( Elements,mid+1,end);
        return node;

    }


}