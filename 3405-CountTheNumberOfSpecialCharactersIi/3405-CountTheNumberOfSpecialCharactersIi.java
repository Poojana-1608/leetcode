// Last updated: 8/11/2026, 11:29:04 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        int small[]=new int[26];
        int capital[]=new int[26];
        Arrays.fill(small,-1);
        Arrays.fill(capital,-1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                small[ch-'a']=i;
            }
            else{
                if(capital[ch-'A']==-1){
                    capital[ch-'A']=i;
                }
            }
        }
            int count=0;
            for(int i=0;i<26;i++){
                if(small[i]!=-1 && capital[i]!=-1 && small[i]<capital[i]){
                    count++;
                }

            }
            
            return count;
    }
}