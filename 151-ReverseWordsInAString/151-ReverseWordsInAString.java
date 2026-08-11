// Last updated: 8/11/2026, 11:35:14 AM
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
                sb.append(arr[i]);
                if(i!=0){
                    sb.append(" ");
                }
        }
        return sb.toString();
    }
}