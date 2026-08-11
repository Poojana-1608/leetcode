// Last updated: 8/11/2026, 11:32:18 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int originalcolor=image[sr][sc];
       if(originalcolor==color) return image;
       dfs(image,sr,sc,originalcolor,color);
       return image; 
    }
    public static void dfs(int[][] image,int r,int c,int originalcolor,int color){
        if(r<0 || r>=image.length || c<0 || c>=image[0].length)return;
        if(image[r][c]!=originalcolor) return;
        image[r][c]=color;
        dfs(image,r-1,c,originalcolor,color);
        dfs(image,r+1,c,originalcolor,color);
        dfs(image,r,c-1,originalcolor,color);
        dfs(image,r,c+1,originalcolor,color);
    }
}