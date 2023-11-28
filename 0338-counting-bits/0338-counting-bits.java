class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        while(n>=0){
            ans[n] = brian_kernighan(n);
            n--;
        }
        return ans;
    }
    
    int brian_kernighan(int num){
        int count = 0;
        while(num>0){
            num = num&(num-1);
            count++;
        }
        return count;
    }
}