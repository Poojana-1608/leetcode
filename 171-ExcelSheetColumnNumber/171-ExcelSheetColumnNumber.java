// Last updated: 8/11/2026, 11:34:58 AM
class Solution {
    public int titleToNumber(String columntitle) {
        int res=0;
        for(int i=0;i<columntitle.length();i++){
            char ch=columntitle.charAt(i);
            res=res*26+(ch-'A'+1);
        }
        return res;
    }
}