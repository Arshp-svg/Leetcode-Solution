class Solution {
    public List<Boolean> camelMatch(String[] queries, String p) {
        List<Boolean> ans= new ArrayList<>();
        for(String s:queries){
            ans.add(res(s,p));
        }
        return ans;
    }
    private boolean res(String s, String p){
        int i=0,j=0;
        while(i<s.length()){
            if(j<p.length() && s.charAt(i)==p.charAt(j)){
                j++;
            }else if(Character.isUpperCase(s.charAt(i))){
                    return  false;
                }

            i++;

            
        }return j==p.length();
    }
}