class Solution {
    public String convertToTitle(int col) {
        StringBuilder ans= new StringBuilder();
        while(col>0){
            col--;
            char c= (char) (col%26 +'A');
            col/=26;
            ans.append(c);
        }
        ans.reverse();
        return ans.toString();
    }
}