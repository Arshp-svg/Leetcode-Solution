class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=(i+1)*(97 + 26 - (int) s.charAt(i));

        }
        return ans;
    }
}