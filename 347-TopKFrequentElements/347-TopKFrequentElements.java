// Last updated: 8/11/2026, 11:33:26 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int []result=new int[k];
        int index=0;
        while(index<k){
        int maxkey=-1;
        int maxfreq=0;
        for(int key:map.keySet()){
            if(map.get(key)>maxfreq){
                maxfreq=map.get(key);
                maxkey=key;
            }
        }
        result[index]=maxkey;
        map.remove(maxkey);
        index++;
        }
        return result;
    }
}