class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int i = x;
        
        while (x>=1) {
            sum+= x % 10;
            x /= 10;
        }
        
        if(i % sum == 0) return answer;
        return false;
    }
}