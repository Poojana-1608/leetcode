// Last updated: 8/11/2026, 11:29:37 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(heights[j]<heights[j+1]){
                    int ht=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=ht;
            
                String st=names[j];
                names[j]=names[j+1];
                names[j+1]=st;
                }
        }
    }
    return names;
    }
}