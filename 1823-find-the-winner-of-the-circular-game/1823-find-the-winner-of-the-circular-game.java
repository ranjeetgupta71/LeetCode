class Solution {
    public int findTheWinner(int n, int k) {
        
        int totalFrds = n;
        
        ArrayList<Integer> arrL = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arrL.add(i);
        }
            
        int i=0;
        int removeEle = 0;
        while(totalFrds!=1){
            i = (i + k -1)%arrL.size();
            removeEle = i;
            i = (i)%arrL.size();
            System.out.println(arrL.remove(removeEle));
            totalFrds--;
            System.out.println(i+ " "+ totalFrds);
        }
        
        return arrL.get(0);
    }
}