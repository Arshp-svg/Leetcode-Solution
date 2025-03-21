class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        int val = hash.get(s.charAt(0));
        for (int i : hash.values()) {
            if (i != val)
                return false;
        }
        return true;
    }
}