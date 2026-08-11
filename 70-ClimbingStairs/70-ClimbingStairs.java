// Last updated: 8/11/2026, 11:36:21 AM
class Solution {
    public int climbStairs(int n) {
      int a=0;
      int b=1;
      int sum=0;
      for(int i=0;i<n;i++){
        sum=a+b;
        a=b;
        b=sum;
      }
      return sum;  
    }
}