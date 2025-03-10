class Solution {
    public char findTheDifference(String s, String t) {
       s+=t; char c=0;
    for(char x: s.toCharArray())
    {
        c^=x;
    }
    return c;
    }
}