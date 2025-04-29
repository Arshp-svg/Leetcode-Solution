class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt=0;
        int prfxsum=0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); 


        for(int num :nums){
            prfxsum+=num;

            int mod = prfxsum % k;
            if(mod<0) {
                mod=mod+k;
            }

            if (mpp.containsKey(mod)) {
                cnt += mpp.get(mod);
                mpp.put(mod, mpp.get(mod) + 1);
            } else {
                mpp.put(mod, 1);
            }



        }
        return cnt;
    }
}