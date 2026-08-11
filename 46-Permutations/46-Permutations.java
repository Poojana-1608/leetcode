// Last updated: 8/11/2026, 11:36:45 AM
class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
		List<Integer> x =new ArrayList<>();
		subset(res,x,arr);
		//System.out.println(res);
        return res;
	}
	public static void subset(List<List<Integer>> result,List<Integer> current,int arr[]){
	    if(current.size()==arr.length)
	        result.add(new ArrayList<>(current));
	   else{ 
	    for (int i=0;i<arr.length;i++){
	        if((current.contains(arr[i])))
	            continue;
	        current.add(arr[i]);
	        subset(result,current,arr);
	        current.remove(current.size()-1);
	    } 
	}
}
}

        

