class Solution {
    public int[] solution(int n, int m) {
        
        int a,b;
        
        if(n>m) {
            a = n; b = m;
        } else {
            a = m; b = n;
        }
        
        while (b!=0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        int[] answer = {a, n*m/a};
        return answer;
    }
}