// Last updated: 8/11/2026, 11:35:28 AM
class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=c^nums[i];
        }return c;
    }
}