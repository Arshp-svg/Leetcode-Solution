class Solution {
    public int lengthOfLastWord(String s) {
      int n=s.length()-1;
      int cnt=0;
      for(int i=n;i>=0;i--){
        if(s.charAt(i)==' '&& cnt==0)continue;
        else if(s.charAt(i)==' ' && cnt>0) break;
        else cnt++; 

      }return cnt;
    }
}