class Solution {
    public int findClosestNumber(int[] nums) {
        int close = Integer.MAX_VALUE; 
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(close) || (Math.abs(num) == Math.abs(close) && num > close)) {
                close = num;
            }
        }
        return close;
    }
}