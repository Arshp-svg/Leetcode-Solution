class Solution {
  public int minTaps(int n, int[] ranges) {
    int[] dp = new int[n + 1];

    for (int i = 0; i <= n; ++i) {
      int l = Math.max(0, i - ranges[i]);
      int r = Math.min(n, i + ranges[i]);
      dp[l] = Math.max(dp[l], r - l);
    }

    int ans = 0;
    int last = 0;
    int end = 0;

    for (int i = 0; i < n; i++) {
      end = Math.max(end, i + dp[i]);
      if (i == last) {
        ++ans;
        last = end;
      }
    }

    return last == n ? ans : -1;
  }
}