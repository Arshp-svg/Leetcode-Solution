class Solution {
    public int[][] kClosest(int[][] points, int k) {
   PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
     for(int[] num: points){ 
            maxHeap.add(num);
            if(maxHeap.size() > k) maxHeap.poll(); 
        }
      int[][] ans = new int[k][2];
      int i=0;
      while(!maxHeap.isEmpty()){
        ans[i++]=maxHeap.poll();
      }
      return ans;

    
}
}