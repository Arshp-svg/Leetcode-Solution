class Solution {
    public int countWords(String[] words1, String[] words2) {
         HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(String w:words1){
            map1.put(w,map1.getOrDefault(w,0)+1);
        }
        for(String w:words2){
            map2.put(w,map2.getOrDefault(w,0)+1);
        }

        int ans=0;
        for(String word : words1){
            if(map1.get(word)==1 && map2.getOrDefault(word,0)==1){
                ans++;
            }
        }
        return ans;

    }
}