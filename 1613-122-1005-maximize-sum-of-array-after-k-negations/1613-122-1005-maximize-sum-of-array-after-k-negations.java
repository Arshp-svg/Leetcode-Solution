class Solution {
    public int largestSumAfterKNegations(int[] nums, int K) {
         Arrays.sort(nums);

        for (int i = 0; K > 0 && i < nums.length && nums[i] < 0; ++i, --K)
            nums[i] = -nums[i];
        int res = 0, min = Integer.MAX_VALUE;
        for (int a : nums) {
            res += a;
            min = Math.min(min, a);
        }
        return res - (K % 2) * min * 2;
      

    }
}