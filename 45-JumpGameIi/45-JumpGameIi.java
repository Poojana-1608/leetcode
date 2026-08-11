// Last updated: 8/11/2026, 11:36:48 AM
class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int curr=0;
        int far=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,nums[i]+i);
            if(i==curr){
                jumps++;
                curr=far;
            }
        }
        return jumps;
    }
}