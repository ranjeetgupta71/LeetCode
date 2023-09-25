class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        
        int n = maxHeights.size();
        long sum = 0;
        long globalMax = 0;
        
        for(int i=0;i<n;i++){
            sum+= maxHeights.get(i);
            int prev = maxHeights.get(i);
            
            for(int j=i-1;j>=0;j--){
                prev = Math.min(prev,maxHeights.get(j));
                sum+=prev;
            }
            prev = maxHeights.get(i);
            for(int k = i+1;k<n;k++){
                // System.out.println(prev+": "+globalMax+" : "+sum);
                prev = Math.min(prev,maxHeights.get(k)); // 3 3 1 1
                sum+=prev;
            }
            // System.out.println(sum+": "+globalMax);
            globalMax = Math.max(sum,globalMax);
            sum = 0;
        }
        
        
        return globalMax;
    }
}