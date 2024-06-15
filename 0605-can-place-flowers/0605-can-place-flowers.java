class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean flag = true;
        int prev = 0;
        int count = 0;
        int next=0;
        
        for(int i=0;i<flowerbed.length;i++){
            int curr = flowerbed[i];
            if(i+1<flowerbed.length){
                 next = flowerbed[i+1];
            }
            if(prev == 0 && curr == 0 && next == 0){
                flowerbed[i] =1; 
                count++;
                curr = 1;
            }else if(i+1 == flowerbed.length && prev == 0 && curr ==0){
                flowerbed[i] = 1;
                count++;
            }
            prev = curr;

        }
        return (count>=n);
        
    }
}