// Last updated: 8/11/2026, 11:34:06 AM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            if(num>0){
                sum+=num%10;
                sum+=num/10;
            }num=sum;
        }return num;

        
    }
}