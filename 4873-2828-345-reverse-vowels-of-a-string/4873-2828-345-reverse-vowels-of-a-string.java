class Solution {
    public String reverseVowels(String s) {
       char[] arr=s.toCharArray();
        int st=0,end=arr.length-1;  
        while(st<end){
            if(isVowel(arr[st])&&isVowel(arr[end])){
                 char temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }else if(!isVowel(arr[st])){
                st++;
            }else{
                end--;
            }
        }return new String(arr);
    }
    public boolean isVowel(char y){
        if(y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U'){
                return true;
            }
        return false;
    }
}