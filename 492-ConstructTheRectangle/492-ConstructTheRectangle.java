// Last updated: 8/11/2026, 11:32:50 AM
class Solution {
    public int[] constructRectangle(int area) {
      int w=(int)Math.sqrt(area);
      while(area%w!=0){
        w--;
      }
      return new int[]{area/w,w};

    }
}