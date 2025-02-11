class Solution {
  public boolean canJump(int[] nums) {
    int ans = 0;

    for (int i = 0; ans < nums.length && ans <= i; ++ans)
      i = Math.max(i, ans + nums[ans]);

    return ans == nums.length;
  }
}