class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        back(ans, n,0,"");
         return ans;
    }
    private void back(List<String> res, int n, int idx, String s){
        if(idx==n){
            res.add(s);
            return;
        }
        back(res, n, idx + 1, s + '1');

        if(s.isEmpty()|| s.charAt(idx-1)=='1'){
             back(res, n, idx + 1, s + '0');
        }

    }
}