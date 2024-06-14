class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        
        int l1 = word1.length();
        int l2 = word2.length();
        int i=0;
        while(i!= word1.length() && i!=word2.length()){
            ans+=word1.charAt(i);
            ans+=word2.charAt(i);
            i++;
        }
        
        if(l1>l2){
            while(i!=l1){
                ans+=word1.charAt(i);
                i++;
            }
        }
        
        if(l2>l1){
            while(i!=l2){
                ans+=word2.charAt(i);
                i++;
            }
        }
        return ans;
        
    }
}


// l1 = abcde. l2 = efg ==> aebfcg