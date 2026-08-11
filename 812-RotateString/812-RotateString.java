// Last updated: 8/11/2026, 11:31:47 AM
class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()){
        return false;
       }
       return (s+s).contains(goal); 
    }
}