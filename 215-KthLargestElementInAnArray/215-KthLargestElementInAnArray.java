// Last updated: 8/11/2026, 11:34:33 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       for(int n:nums){
        pq.offer(n);
        if(pq.size()>k){
            pq.poll();
        }
       }
       return pq.peek(); 
    }
}