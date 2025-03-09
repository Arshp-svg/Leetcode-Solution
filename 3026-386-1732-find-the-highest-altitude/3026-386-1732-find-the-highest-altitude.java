class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int maxi=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            maxi=Math.max(maxi,curr);
        }
        return maxi;
    }
}