class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int j=n-1;
        int ans = Integer.MIN_VALUE;
        int i=0;
        
        while(i!=j){
            
            if(height[i]>=height[j]){
                ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
                j--;
            }else{
                ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
                i++;
            }
        }
        return ans;
    }
}