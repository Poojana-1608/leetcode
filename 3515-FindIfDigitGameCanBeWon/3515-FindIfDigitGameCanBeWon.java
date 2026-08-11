// Last updated: 8/11/2026, 11:28:52 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0;
        int s2=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        
            if(nums[i]>=1 && nums[i]<=9){
                s1=s1+nums[i];
            }
            if(nums[i]>=10 && nums[i]<=99){
                s2=s2+nums[i];
            }
        }
        
        if(s1>totalsum-s1)
        return true;
        if(s2>totalsum-s2)
        return true;
        return false;
    }
}