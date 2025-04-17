class Solution {
    public String truncateSentence(String s, int k) {
    int cnt=0;
    int ans=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' ') cnt++;
        if(cnt==k){
            ans=i;
            break;
        } 
        
       }
       if (ans==0) return s;
       return s.substring(0,ans);
    }
}