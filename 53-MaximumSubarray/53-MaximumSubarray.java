// Last updated: 8/11/2026, 11:36:35 AM
class Solution {
    public int maxSubArray(int[] arr) {
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}