class Solution {
    public boolean hasSameDigits(String s) {
       
        while(s.length()>2){
            StringBuilder ans=new  StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int num1=s.charAt(i)-'0';
                int num2=s.charAt(i+1)-'0';
                int digit=(num1+num2)%10;
                ans.append(digit);


            }
        s=ans.toString();
        }





        return s.charAt(0)==s.charAt(1);
    }
}