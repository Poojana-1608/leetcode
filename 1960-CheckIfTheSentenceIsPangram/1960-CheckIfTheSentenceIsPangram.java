// Last updated: 8/11/2026, 11:30:21 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr= sentence.toCharArray();
        for(int i=97;i<=122;i++){
            int n=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=(char)(i)){
                continue;
                }
            else{
                n=1;
                break;
            }
            }
            if(n==1) continue;
            return false;
        }
        return true;
        
    }
}