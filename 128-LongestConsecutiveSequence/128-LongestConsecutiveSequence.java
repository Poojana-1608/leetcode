// Last updated: 8/11/2026, 11:35:30 AM
class Solution {
    public int longestConsecutive(int[] arr) {
       int n=arr.length;
       int maxlen=0;
       if(n==0)
       return 0;
       int count=1;
       Arrays.sort(arr);
       for(int i=1;i<n;i++){
        if(arr[i]==arr[i-1]){
            continue;
        }
        if(arr[i]-1==arr[i-1]){
            count++;
        }
        else{
            maxlen=Math.max(maxlen,count);
            count=1;
        }
       }
       return Math.max(maxlen,count);
    }
}
