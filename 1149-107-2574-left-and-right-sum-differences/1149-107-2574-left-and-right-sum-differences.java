class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int totalSum = 0, leftSum = 0;

        for (int num : nums) totalSum += num;

        for(int i=0;i<n;i++){
            int rightsum=totalSum-nums[i]-leftSum;
            ans[i]=Math.abs(rightsum-leftSum);
            leftSum+=nums[i];
        }

        return ans;
    }
}