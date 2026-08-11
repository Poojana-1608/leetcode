// Last updated: 8/11/2026, 11:32:43 AM
class Solution {
    public boolean checkPerfectNumber(int nums) {
        int sum=0;
        for(int i=1;i<nums;i++){
            if(nums%i==0)
            sum=sum+i;
        }return sum==nums;
    }
}