class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       
        List<List<Integer>> ans=new ArrayList<>() ;
        comb(k,n,1,new ArrayList<>(),ans);
        return ans;
    }
    private void comb(int k,int n,int i, List<Integer> arr,List<List<Integer>> ans){
        if(k==0 && n==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(k==0 || n<0){
            return ;
        }
        for(int y=i;y<=9;++y){
            arr.add(y);
            comb(k-1,n-y,y+1,arr,ans);
            arr.remove(arr.size()-1);

        }
    }
}