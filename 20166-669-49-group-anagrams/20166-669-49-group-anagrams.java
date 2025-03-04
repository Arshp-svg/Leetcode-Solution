class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp=new HashMap<>();
        for(String s: strs){
            char[] str= s.toCharArray(); 
            Arrays.sort(str);
            String sorted= new String(str);
            if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(s);







        }
        return new ArrayList<>(mp.values());
    }
}