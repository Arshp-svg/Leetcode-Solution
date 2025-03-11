class Solution {
  public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (words.length != pattern.length())
      return false;

    Map<Character, Integer> CharIndex = new HashMap<>();
    Map<String, Integer> strIndex = new HashMap<>();

    for (Integer i = 0; i < pattern.length(); ++i)
      if (CharIndex.put(pattern.charAt(i), i) != strIndex.put(words[i], i))
        return false;

    return true;
  }
}