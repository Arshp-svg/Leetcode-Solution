class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
         List<Integer> arr = new ArrayList<>();
        backt(1,arr,ans, n, k);
        return ans;
    }
    private void backt(int st,List<Integer> arr, List<List<Integer>> ans, int n, int k ){
        if(arr.size()==k){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (int num = st; num <= n; num++) {
            arr.add(num);
            backt(num + 1, arr, ans, n, k);
            arr.remove(arr.size() - 1);
        }

    }
}