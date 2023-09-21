class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        for(int i=n-1;i>0;i--){
            int curr = nums[i];
            int next = nums[i-1];
    
            if(next<curr){
                int minimum = findMin(curr,next,i,nums);
                int temp = nums[minimum];
                nums[minimum] = nums[i-1];
                nums[i-1] = temp;
                sortTheRest(i,nums);
                return;
            }
             
        }
        Arrays.sort(nums);
    }
    
    int findMin(int currMin,int compare,int minIndex,int[] nums ){
        int minimum=minIndex;
        for(int i=minIndex;i<nums.length;i++){
            if(nums[i]<currMin && nums[i] > compare){
                currMin = nums[i];
                minimum = i;
            }
        }
        return minimum;
    }
       
    void sortTheRest(int curr,int[] nums){
        for(int i=curr;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    
    
}