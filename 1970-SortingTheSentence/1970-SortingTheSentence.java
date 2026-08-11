// Last updated: 8/11/2026, 11:30:16 AM
class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        for(String word:str){
            int i=word.charAt(word.length()-1)-'0';
            res[i-1]=word.substring(0,word.length()-1);
        }
        return String.join(" ",res);
    }
}
        
        
    
