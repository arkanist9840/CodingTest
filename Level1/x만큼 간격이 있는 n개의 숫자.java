class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for (int a=0; a<n; a++) {
            answer[a]=(a+1)*x;
        }
        return answer;
    }
}