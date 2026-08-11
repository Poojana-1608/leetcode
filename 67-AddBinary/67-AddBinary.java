// Last updated: 8/11/2026, 11:36:28 AM
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry==1){
            int sum=carry;
            if(i>=0){
                sum=sum+a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum=sum+b.charAt(j)-'0';
                j--;
            }
            s.append(sum%2);
            carry=sum/2;
        }
        return s.reverse().toString();
    }
}
        