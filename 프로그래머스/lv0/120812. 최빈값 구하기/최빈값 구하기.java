class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count=0;
        int[] arr = new int[1001];
        
        for(int i=0; i<array.length; i++){
            arr[array[i]]++;
        }
        int max = 0;
        int max_index =0;
        
        for(int j=0; j<arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
                max_index = j;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(max==arr[j])
                count++;
        }
        if(count>1)
            return -1;
        answer=max_index;
        return answer;
    }
}