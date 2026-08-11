// Last updated: 8/11/2026, 11:29:53 AM
class Solution {
    public String largestGoodInteger(String nums) {
        char val = 0;

        for (int i = 0; i <= nums.length() - 3; i++) {
            char s = nums.charAt(i);
            if (s == nums.charAt(i + 1) && s == nums.charAt(i + 2)) {
                if (s > val) { 
                    val = s;
                }
            }
        }

        if (val == 0) { 
            return "";
        }

        return "" + val + val + val;
    }
}
