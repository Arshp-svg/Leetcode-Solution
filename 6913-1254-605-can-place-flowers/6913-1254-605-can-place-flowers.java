class Solution {
    public boolean canPlaceFlowers(int[] flower, int f) {
        int n=flower.length-1;
        for(int i=0;i<=n && f>0;i++){
             boolean prev = i == 0 || flower[i - 1] == 0;
            boolean nxt = i ==n || flower[i + 1] == 0;

            if(prev && nxt && flower[i]==0){
                flower[i]=1;
                f--;
            }
        }
        return f<=0;
    }
}