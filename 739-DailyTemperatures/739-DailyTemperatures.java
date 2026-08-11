// Last updated: 8/11/2026, 11:32:09 AM
class Solution {
    public int[] dailyTemperatures(int[] temperature) {
        int n=temperature.length;
        int ans[]=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperature[i]>temperature[stack.peek()]){
                int index=stack.pop();
                ans[index]=i-index;
            }
            stack.push(i);
        }
        return ans;
    }
}