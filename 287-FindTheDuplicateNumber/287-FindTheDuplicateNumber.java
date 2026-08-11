// Last updated: 8/11/2026, 11:33:51 AM
class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int n:nums){
        if(set.contains(n)){
            return n;
        }
        set.add(n);
       }
       return -1;
    }
}