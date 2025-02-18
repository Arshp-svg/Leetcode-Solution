class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        sub(nums, 0, op, ans);
        return ans;
      


    }
    public void sub(int[] nums, int start , List<Integer>op,List<List<Integer>> ans){
        if(nums.length==start){
            ans.add(new ArrayList<>(op));
            return;
        }
        sub(nums,start+1,op,ans);
        op.add(nums[start]);
        sub(nums,start+1,op,ans);
        op.remove(op.size()-1);

    }
    
    }