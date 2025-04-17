class Solution {
    public int numberOfBeams(String[] bank) {
       if(bank.length<2) return 0;

       int ans=0;
       int prev=0;
       int curr=0;
       for(String row:bank){
        curr=0;
        for(char c:row.toCharArray()){
            if(c=='1') curr++;
        }
        ans+=curr*prev;
        prev=curr==0? prev:curr;


       }
       return ans;
    }
}