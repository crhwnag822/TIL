class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int elem : array){
            if(elem == n)
                answer++;
        }
        return answer;
    }
}