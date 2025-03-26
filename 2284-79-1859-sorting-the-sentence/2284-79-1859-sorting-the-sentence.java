class Solution {
    public String sortSentence(String s) {
        String[] w=s.split(" ");
        String[] temp=new String[w.length];
        for (String word : w) {
			int index = word.charAt(word.length() - 1) - '1';
			temp[index] = word.substring(0, word.length() - 1);
		}

        return String.join(" ",temp);
    }
}