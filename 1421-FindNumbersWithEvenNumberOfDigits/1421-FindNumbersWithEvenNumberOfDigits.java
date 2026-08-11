// Last updated: 8/11/2026, 11:30:52 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int digits = 0;
            while (n != 0) {
                digits += 1;
                n = n / 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
