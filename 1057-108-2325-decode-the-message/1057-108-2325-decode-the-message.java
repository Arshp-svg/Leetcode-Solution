class Solution {
    public String decodeMessage(String key, String m) {
        HashMap<Character,Character> mp = new HashMap<>();
        char ch='a';
        for(char c:key.toCharArray()){
            if(c != ' ' && !mp.containsKey(c)) mp.put(c,ch++);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:m.toCharArray()){
            if(mp.containsKey(c))
            {
                sb.append(mp.get(c));
            }
            else{
                sb.append(c);
            }
        }return sb.toString();
    }
}