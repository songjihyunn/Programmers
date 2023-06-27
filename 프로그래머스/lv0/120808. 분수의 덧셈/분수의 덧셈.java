class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = (numer1 * denom2) + (numer2 * denom1);
        int b = denom1 * denom2;
        
        for(int i=a-1; i>1; i--){
            if(a % i == 0 && b % i ==0){
                a /= i;
                b /=i;
            }
        }
        int[] answer = {a, b};
        return answer;
    }
}