// Last updated: 8/11/2026, 11:37:53 AM
class Solution {
    public String convert(String s, int numrows) {
        if(numrows==1){
            return s;
        }
        StringBuilder[] sb=new StringBuilder[numrows];
        for(int i=0;i<numrows;i++){
            sb[i]=new StringBuilder();
        }
        int curr=0;
        boolean down =true;
        for(char ch:s.toCharArray()){
            sb[curr].append (ch);
            if(curr==0){
                down=true;
            }
            if(curr==numrows-1){
                down =false;
            }
            if(down){
                curr++;
            }
            else{
                curr--;
            }
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder row:sb){
            res.append(row);
        }
        return res.toString();
    }
}

      