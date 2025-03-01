class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
        
        backt(nums,0,ans);
        return ans;
    }
    public void backt( int[] nums,int start,List<List<Integer>> ans){
        if(nums.length==start){
             List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

            for(int i=start;i<nums.length;i++){
                swap(nums,start,i);
                backt(nums,start+1,ans);
                swap(nums,start,i);
            }
            
        

    }
    private void swap(int[] nums,int i,int j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
            }
        

}