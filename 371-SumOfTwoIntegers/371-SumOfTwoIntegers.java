// Last updated: 8/11/2026, 11:33:16 AM
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; 
            a = a ^ b;                 
            b = carry;                 
        }
        return a;
    }
}
