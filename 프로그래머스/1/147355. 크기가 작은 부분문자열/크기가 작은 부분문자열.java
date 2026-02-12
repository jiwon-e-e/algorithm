class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long intP = Long.parseLong(p);
        int len = p.length();
        
        for (int i=0;i<t.length()-len+1;i++){
            String newT = t.substring(i,i+len);
            long intT = Long.parseLong(newT);

            if (intT<=intP){
                answer++;
            }
        }
        
        return answer;
    }
}