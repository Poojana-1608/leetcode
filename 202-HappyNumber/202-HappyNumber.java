// Last updated: 8/11/2026, 11:34:48 AM
class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while (n != 1) {
            sum = 0; 
            while (n > 0) {
                int x = n % 10;   
                sum += x * x;     
                n /= 10;           
            }
            if (sum == 4) {
                return false;  
            }n = sum;
        }return true;
    }
}