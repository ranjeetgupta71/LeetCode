class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String item = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == ' '&& item.length() == 0){
                continue;
            }else if(item.length()>0 && ch == ' '){
                st.push(item);
                item = "";
            }else{
                 item = item + ch;
            }
            
            if(item.length()>0 && i == s.length()-1){
                st.push(item);
            }
        }
        
        String ans = "";
        while(!st.isEmpty()){
            item = st.pop();
            ans = ans + item;
            ans += ' ';
        }
        
        ans = ans.substring(0,ans.length()-1);
        
        
        return ans;
    }
}