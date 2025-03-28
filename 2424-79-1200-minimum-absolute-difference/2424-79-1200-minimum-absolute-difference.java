class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int diff = arr[i] - arr[i - 1];
      if (diff < min) {
        min = diff;
        ans.clear();
      }
      if (diff == min)
        ans.add(Arrays.asList(arr[i - 1], arr[i]));
        }
        return ans;
    }
}