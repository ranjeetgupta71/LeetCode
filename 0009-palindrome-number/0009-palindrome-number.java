class Solution {
    public boolean isPalindrome(int x) {
        String n = Integer.toString(x);
        return isPalindrom(n);
    }
    
    boolean isPalindrom(String n){
        if(n.length() == 0 || n.length() == 1)return true;
        
        if(n.charAt(0) == n.charAt(n.length()-1)){
            return isPalindrom(n.substring(1,n.length()-1));
        }else
            return false;
        
    }
    
}


