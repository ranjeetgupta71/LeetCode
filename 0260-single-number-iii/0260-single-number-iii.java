class Solution {
    public int[] singleNumber(int[] nums) {
        int xy = 0;
        for(int n: nums){
            xy^=n;
        }
        
        xy &= -xy;
        
        int[] res = new int[2];
        
        for(int n:nums){
            if((xy & n) == 0) res[0] ^= n ;
            else{
                res[1] ^= n ;
            }
        }
        
        return res; 
    }
}