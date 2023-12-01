class Solution {
    public long distributeCandies(int n, int limit) {
        long totalWays = 0;
        for(int x=0;x<=Math.min(limit,n);x++){
            if((n-x)<=2*limit){
                long min = (n-x) - Math.min(limit,n-x);
                long max = Math.min((n-x) , limit);
                
                totalWays += (max - min)+1;
            }
                    
                        
        }  
        return totalWays;
    }
}
// x=0  ways = 4
//     3,3

//     0,3
//     1,2
//     2,1
//     3,0
// x=1 ways =3
//     2,3
    
//     0,2
//     1,1
//     2,0
// x=2 ways = 
//     1,3
    
//     0,1
//     1,0

// x=3
//     0,3
    
//     0,0