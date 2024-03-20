class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        TreeMap<Integer,TreeSet<Integer>> map = new TreeMap<>();
        long totalSum=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new TreeSet<>());
            }
            map.get(nums[i]).add(i);
            totalSum+=(long)nums[i];
        }
        
        long[] ans = new long[queries.length];
        int idx=0;
        for(int[] q: queries){
            if(totalSum == 0) break;
            if(nums[q[0]]!=-1){
                totalSum-=nums[q[0]];
                remove(map,nums[q[0]],q[0]);
                nums[q[0]]=-1;
            }
            if(totalSum==0)break;
            
            for(int j=1;j<=q[1]&& totalSum>0;j++){
                Integer min = map.firstKey();
                Integer minIdx = map.get(min).first();
                remove(map,min,minIdx);
                totalSum-=min;
                nums[minIdx]=-1;
            }
            ans[idx++]=totalSum;
        }
        return ans;
    }
    
    public void remove(TreeMap<Integer,TreeSet<Integer>> map, int key, int idx){
        map.get(key).remove(idx);
        if(map.get(key).size() == 0)map.remove(key);
    }
    
}