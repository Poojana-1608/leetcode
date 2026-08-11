// Last updated: 8/11/2026, 11:29:09 AM
class Solution {
    public String removeTrailingZeros(String num) {
      int i=num.length()-1;
      while(i>0 && num.charAt(i)=='0'){
        i--;
      }
      return num.substring(0,i+1);
    }
}