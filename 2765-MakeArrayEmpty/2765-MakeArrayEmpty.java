// Last updated: 8/11/2026, 11:29:11 AM
class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int n = nums.length;

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        long ans = n;

        for(int i = 1; i < n; i++) {
            if(arr[i][1] < arr[i - 1][1]) {
                ans += n - i;
            }
        }

        return ans;
    }
}