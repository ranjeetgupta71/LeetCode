class Solution {
    public int maxVowels(String s, int k) {
        
        int ans = 0;
        var vowels = Set.of('a','e','i','o','u');
        
        for(int i=0 , winCount=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(ch)){
                ++winCount;
            }
            if(i>=k && vowels.contains(s.charAt(i-k))){
                --winCount;
            }
            ans = Math.max(winCount,ans);
        }
        
        return ans;
        
    }   
}



   





