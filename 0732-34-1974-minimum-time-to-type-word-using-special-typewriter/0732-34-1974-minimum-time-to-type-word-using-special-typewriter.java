class Solution {
    public int minTimeToType(String word) {
       int sol=0;
        char current = 'a';
        for(char c  : word.toCharArray()){
            int direct_distance = Math.abs( c- current);
            int anit_distance  = 26-direct_distance;
            sol += Math.min(direct_distance, anit_distance) + 1; //type + move
            current = c;
        }
        return sol; 
    }
}