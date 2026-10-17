class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int count =0;
        int current =0;
        // if (requests==null || requests.length<=1){
        //     return 0;
        // }
        for(int i =0; i<requests.length;i++){

            count += Math.abs(current-requests[i]);
            current = requests[i];
            
        }
        return count;
    }
}