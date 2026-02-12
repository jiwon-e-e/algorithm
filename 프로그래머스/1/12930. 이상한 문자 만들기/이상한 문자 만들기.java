import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

class Solution {
        public static String solution(String s){
        String result = "";

        //System.out.println(s.length());
        int cnt = 0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                result = result + " ";
                cnt =0;
            } else if (cnt%2==0) {
                result = result + toUpperCase(s.charAt(i));
                cnt++;
            } else{
                result = result + toLowerCase(s.charAt(i));
                cnt++;
            }
        }
        return result;
    }
}