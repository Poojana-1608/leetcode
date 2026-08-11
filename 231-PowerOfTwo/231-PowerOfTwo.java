// Last updated: 8/11/2026, 11:34:26 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; 
        return (n & (n - 1)) == 0;
    }
}
