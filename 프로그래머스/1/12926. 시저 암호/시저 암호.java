class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c==' '){
                answer += ' ';
                continue;
            }
            
            else if (Character.isUpperCase(c)){
                int temp = (c-'A'+n)%26 +'A';
                answer += (char)temp;
            }
            
            else{
                int temp = (c-'a'+n)%26 +'a';
                answer +=(char)temp;
            }
        }
        
        return answer;
    }
}