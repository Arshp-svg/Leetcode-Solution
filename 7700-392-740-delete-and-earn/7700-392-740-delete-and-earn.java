class Solution {
    public int deleteAndEarn(int[] nums) {
        final int[] values = new int[10001];
        for (int num : nums) {
            values[num] += num;
        }
        int take = 0, skip = 0;
        for (final int value : values) {
            final int temp = Math.max(skip + value, take);
            skip = take;
            take = temp;
        }
        return take;
    }
}