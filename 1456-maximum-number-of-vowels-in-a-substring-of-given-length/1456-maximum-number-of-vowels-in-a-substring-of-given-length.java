class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        
        
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e'||ch == 'i'|| ch == 'o'|| ch == 'u'){
                    count++;
            } 
        }
        
        int j=k-1;
        int i=0;
        int ans = count;
        while(j<n-1){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j+1);
            if(ch1 == 'a'|| ch1 == 'e'||ch1 == 'i'|| ch1 == 'o'|| ch1 == 'u'){
                    count--;      
            }
            if(ch2 == 'a'|| ch2 == 'e'||ch2 == 'i'|| ch2 == 'o'|| ch2 == 'u'){
                    count++;
            }
            i++;
            j++;
            
            ans = Math.max(ans,count);
        }
        return ans;
    }   
}



   





