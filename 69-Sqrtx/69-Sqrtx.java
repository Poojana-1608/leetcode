// Last updated: 8/11/2026, 11:36:24 AM
class Solution {
    public int mySqrt(int x) {
        int i=1;
        while(i<=x/i){
            i++;
        }
        return i-1;
    }
}