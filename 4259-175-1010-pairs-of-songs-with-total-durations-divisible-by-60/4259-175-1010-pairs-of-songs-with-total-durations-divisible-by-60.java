class Solution {
    public int numPairsDivisibleBy60(int[] time) {
   int cntarr[]  = new int[60], ans = 0;
        for (int t : time) {
            ans += cntarr[(600 - t) % 60];
            cntarr[t % 60] += 1;
        }
        return ans;
    }
}