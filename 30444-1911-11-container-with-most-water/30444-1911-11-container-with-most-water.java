class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int Mostwater=0;

        while(left<right){
            int tempwater=Math.min(height[left],height[right])*(right-left);
            Mostwater=Math.max(tempwater,Mostwater);
            if(height[left]<height[right]){
                left++;
            }else right--;
        }
        return Mostwater;
    }
}