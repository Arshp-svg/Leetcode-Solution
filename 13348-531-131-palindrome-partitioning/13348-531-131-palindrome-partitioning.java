class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        dfs(s,0,new ArrayList<>(),ans);
        return ans;

    }
    void dfs(String s, int start, List<String> temp,List<List<String>> ans){
        if(s.length()==start){
            ans.add(new ArrayList<>(temp));
            return;

        }
        for(int i=start;i<s.length();i++){
            if(isPalindrome(s,start,i)){
                temp.add(s.substring(start,i+1));
                dfs(s,i+1,temp,ans);
                temp.remove(temp.size()-1);

            }
        }
    }

    boolean isPalindrome(final String s, int l, int r) {
    while (l < r)
      if (s.charAt(l++) != s.charAt(r--))
        return false;
    return true;
  }
}