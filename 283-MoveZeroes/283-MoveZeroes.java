// Last updated: 8/11/2026, 11:33:54 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
            while(i<nums.length){
                nums[i]=0;
                i++;
            }
        
    }
}
            
            

        