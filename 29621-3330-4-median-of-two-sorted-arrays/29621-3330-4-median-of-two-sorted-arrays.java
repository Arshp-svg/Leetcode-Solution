class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, mid1 = 0, mid2 = 0;
        for(int cnt=0;cnt<= (m+n)/2;cnt++){
            mid2 = mid1;
            if(i != n && j != m){
                if(nums1[i]>nums2[j]){
                    mid1 = nums2[j++];
                }else{
                   mid1 = nums1[i++];
                }

            }else if(i<n){

                    mid1=nums1[i++];
            }else
            {
                 mid1=nums2[j++]; 
            }

        }
        if((m+n)%2==1) return mid1;
        else return ((double) mid1 + (double) mid2)/2.0;
    }
}