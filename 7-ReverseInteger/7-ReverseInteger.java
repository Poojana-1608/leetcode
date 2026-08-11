// Last updated: 8/11/2026, 11:37:50 AM
class Solution {
    public int reverse(int x) {
        
        int flag=1;
        if(x<0){
            x=x*(-1);
            flag=-1;
        }
        long y=0;
        while(x!=0){
            y=y*10+(x%10);
            x/=10;
        }
            y=y*flag;
            return (y< Integer.MIN_VALUE || y> Integer.MAX_VALUE)? 0:(int)y ;
            
    }
}
