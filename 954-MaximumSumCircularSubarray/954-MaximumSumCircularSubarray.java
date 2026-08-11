// Last updated: 8/11/2026, 11:31:19 AM
class Solution {
    public int maxSubarraySumCircular(int[] arr) {
     int currmax=arr[0];
     int maxsum=arr[0];
     int currmin=arr[0];
     int minsum=arr[0];
     int total=arr[0];
     int circular;
     for(int i=1;i<arr.length;i++){
        currmax=Math.max(arr[i],currmax+arr[i]);
        maxsum=Math.max(maxsum,currmax);
     
        currmin=Math.min(arr[i],currmin+arr[i]);
        minsum=Math.min(minsum,currmin);
        total+=arr[i];
     }
     if(maxsum<0){
        return maxsum;
     }
     circular=total-minsum;
     return Math.max(circular,maxsum);
    }
} 
