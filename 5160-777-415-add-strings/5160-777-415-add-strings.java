class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int sum;
StringBuilder ans=new StringBuilder();
        int carry=0;
       while(i>=0||j>=0|| carry>0) {
    
            
            int str1=(i>=0)?num1.charAt(i)-'0':0;
            int str2=(j>=0)?num2.charAt(j)-'0':0;

            sum=str1+str2+carry;
            carry=sum/10;
            ans.append(sum%10);


        --i;
        --j;
       }
       return ans.reverse().toString();
      



        

    }
}