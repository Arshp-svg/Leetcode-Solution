class Solution {
public int hIndex(int[] citations) {
    if(citations[citations.length-1]==0) return 0; 
    int s = 0, e = citations.length - 1;
    while(s <= e) {
        int m = s + (e - s) / 2;
       
        if(citations[m] == citations.length - m) {
            return citations[m];
        }
        if(citations[m] < citations.length - m) {
            s = m + 1;
        } else {
            e = m - 1;
        }
    }
   
    return citations.length - s;
}}