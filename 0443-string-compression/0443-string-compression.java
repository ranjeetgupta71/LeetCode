class Solution {
    public int compress(char[] chars) {
        
        int count = 1;
        String res = "";
        res+=chars[0];
        int n = chars.length;
        
        for(int i=0;i<n-1;i++){
            char ch = chars[i];
            if(ch != chars[i+1] ){
                if(count>1)
                res+=count;
                res+= chars[i+1];
                count = 1;
            }else{
                count++;
                if(i == n-2){
                    res+=count;
                }
                
            }
        }
        for(int i=0;i<res.length();i++){
            chars[i] = res.charAt(i);
        }
        return (res.length());
    }
}