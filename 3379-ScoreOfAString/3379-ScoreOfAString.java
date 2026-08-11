// Last updated: 8/11/2026, 11:29:05 AM
class Solution {
    public int scoreOfString(String s) {
       int sum=0;
       for(int i=0;i<s.length()-1;i++){
        sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
       } 
       return sum;
    }
}