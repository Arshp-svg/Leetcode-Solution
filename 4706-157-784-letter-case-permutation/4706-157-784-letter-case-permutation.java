class Solution {
    public List<String> letterCasePermutation(String s) {
        if(s==null) return new LinkedList<>();

        List<String> ans = new LinkedList<>();
        dfs(s.toCharArray(),ans,0);
        return ans;


    }
    void dfs(char[] arr,List<String> ans,int pos){
        if(arr.length==pos) {
            ans.add(new String(arr));
            return;
        }
        if(arr[pos]>='0' && arr[pos]<='9'){
            dfs(arr, ans, pos + 1);
            return;
        }

        arr[pos]=Character.toLowerCase(arr[pos]);
        dfs(arr, ans, pos + 1);

         arr[pos]=Character.toUpperCase(arr[pos]);
        dfs(arr, ans, pos + 1);


    }
}