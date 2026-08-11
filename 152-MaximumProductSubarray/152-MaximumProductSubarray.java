// Last updated: 8/11/2026, 11:35:11 AM
class Solution {
    public int maxProduct(int[] nums) {

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int product = 1;

            for (int j = i; j < nums.length; j++) {

                product *= nums[j];

                ans = Math.max(ans, product);
            }
        }

        return ans;
    }
}