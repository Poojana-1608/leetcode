// Last updated: 8/11/2026, 11:33:33 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n==1){
            return true;
        }
        else if(n==0||n%4!=0){
            return false;
        }
        return  isPowerOfFour(n/4);
    }
}

