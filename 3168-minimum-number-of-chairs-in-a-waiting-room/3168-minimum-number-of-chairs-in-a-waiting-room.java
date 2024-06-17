class Solution {
    public int minimumChairs(String s) {
        int count_E=0;
        int res=Integer.MIN_VALUE;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'E'){
                count_E++;
            }else if(ch == 'L'){
                count_E--;
            }
            
            res = Math.max(count_E,res);
        }
        
        return res;
    }
}