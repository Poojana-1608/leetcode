// Last updated: 8/11/2026, 11:34:32 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
       }
       return false; 
    }
}