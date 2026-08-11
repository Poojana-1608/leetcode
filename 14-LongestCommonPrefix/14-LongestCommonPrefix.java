// Last updated: 8/11/2026, 11:37:35 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the beginning of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If there's no common prefix at all
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
