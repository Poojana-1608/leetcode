// Last updated: 8/11/2026, 11:29:38 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long ans = 0;

        for(int num : nums) {
            if(num == 0) {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }

        return ans;
    }
}