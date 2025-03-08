class Solution {
    public int[] twoSum(int[] num, int target) {
       int s=0;
       int e=num.length-1;
       while(s<e){
        int tt=num[s]+num[e];
        if(tt==target) return new int[] {s+1,e+1};
        else if(tt>target){
            e--;
        }else {
            s++;
        }
       }
        return new int[]{-1, -1};
    }
}