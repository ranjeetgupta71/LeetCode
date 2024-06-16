class Solution {
    public void moveZeroes(int[] nums) {
    
        int zero=0;
        int nonzero=0;
        
        while(nonzero<=nums.length-1 && zero<=nums.length-1 && zero<=nonzero){
            //points to zero
            while(zero<=nums.length-1 && nums[zero] != 0 && zero<=nonzero){
                zero++;
            }
            //points to non-zero
            while(nonzero<nums.length && nums[nonzero]==0){
                nonzero++;
            }
            if(nonzero<nums.length && zero<nonzero)
                swap(zero,nonzero,nums);
            nonzero++;
        }
        
    }
    
    void swap(int zero,int nonzero,int[] nums){
         //swapping zero with non-zero
            int temp = nums[zero];
            nums[zero] = nums[nonzero];
            nums[nonzero] = temp;
    }
    
}