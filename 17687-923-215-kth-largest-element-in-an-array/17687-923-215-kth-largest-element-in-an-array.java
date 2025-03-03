class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->b-a);
        int n = nums.length  ;
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
       
         while (k-1 >0) {
            pq.remove()  ;
            k-- ;
        }
        return pq.peek();
    }
}