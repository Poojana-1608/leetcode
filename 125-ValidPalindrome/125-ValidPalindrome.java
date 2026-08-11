// Last updated: 8/11/2026, 11:35:33 AM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder n=new StringBuilder();
        for(char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                n.append(Character.toLowerCase(c));

            }

        }
        String str1=n.toString();
        String str2=n.reverse().toString();
        return str1.equals(str2);
    }
}
