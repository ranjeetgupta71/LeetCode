class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String c1 = str1 + str2;
        String c2 = str2 + str1;
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }else{
            return str1.substring(0,gcd(str1.length(),str2.length()));
        }

    }
    
    int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}