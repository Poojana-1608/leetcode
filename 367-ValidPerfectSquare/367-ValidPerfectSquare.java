// Last updated: 8/11/2026, 11:33:19 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
        for(long i=2;i<=num;i++){
            if(i*i==num){
                return true;
            }
        }return false;
    }
}