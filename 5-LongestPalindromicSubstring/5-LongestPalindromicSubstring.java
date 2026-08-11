// Last updated: 8/11/2026, 11:37:56 AM
class Solution {

    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            String s1 = expand(s, i, i);

            // Even length
            String s2 = expand(s, i, i + 1);

            if (s1.length() > ans.length())
                ans = s1;

            if (s2.length() > ans.length())
                ans = s2;
        }

        return ans;
    }

    public String expand(String s, int l, int r) {

        while (l >= 0 && r < s.length() &&
               s.charAt(l) == s.charAt(r)) {

            l--;
            r++;
        }

        return s.substring(l + 1, r);
    }
}