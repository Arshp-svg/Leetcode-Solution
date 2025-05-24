class Solution {
     public void backtrack(int[] nums, int index, int currOr, int maxOr, int[] ans){
        if(currOr==maxOr){
            ans[0]++;
        }
        for (int i = index; i < nums.length; i++) {
            backtrack(nums, i + 1, currOr | nums[i], maxOr, ans);
        }


     }

    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        int[] ans=new int[1];
        for (int num : nums) {
            maxOr |= num;
        }
        backtrack(nums, 0, 0, maxOr, ans);

        return ans[0];

    }
}