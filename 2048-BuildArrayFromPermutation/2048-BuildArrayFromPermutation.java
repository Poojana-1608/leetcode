// Last updated: 8/11/2026, 11:30:13 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}