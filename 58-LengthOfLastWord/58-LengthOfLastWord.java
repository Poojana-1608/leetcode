// Last updated: 8/11/2026, 11:36:32 AM
class Solution {
    public int lengthOfLastWord(String s) {
       String arr[]=s.trim().split("\\s+");
       return arr[arr.length-1].length();
        
    }
}