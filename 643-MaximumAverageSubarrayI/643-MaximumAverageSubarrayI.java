// Last updated: 8/18/2026, 12:35:23 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int max=sum;
8        for(int i=k;i<nums.length;i++){
9            sum=sum-nums[i-k]+nums[i];
10            max=Math.max(sum,max);
11        }
12        return (double)max/k;
13    }
14}