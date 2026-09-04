class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        for( int i = 0;i<nums.length; i++){
            int max=0; int min =Integer.MAX_VALUE;
            for(int j = 0; j<=i;j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            

            }
            for( int j = i; j<nums.length; j++){
                if(nums[j]<min){
                    min = nums[j];
                }
            }
            int stable = max -min;

            if(stable <= k){
                return i;
            }

        }
        return -1;
    }
}