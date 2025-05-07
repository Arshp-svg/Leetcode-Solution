class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int[] temp=new int[101];
        for(int a:nums){
            ans+=temp[a]++;
        }
        return ans;
    }
}