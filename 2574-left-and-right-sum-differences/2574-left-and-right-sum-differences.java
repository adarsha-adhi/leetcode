class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] answer = new int [nums.length];

        int [] leftSum = new int [nums.length];
        int [] rightSum =new int [nums.length];

        for( int i =0; i< nums.length; i++){
            if(i<=0){
                leftSum[i]=0;
            }
            for(int j=i-1; j>=0;j--){
                leftSum[i] += nums[j];
            }
            for(int k =i+1; k<nums.length; k++){
                rightSum[i]+=nums[k];
            }
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}