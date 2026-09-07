class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] answer = new int [nums.length];

        // int [] leftSum = new int [nums.length];
        // int [] rightSum =new int [nums.length];

        int totalSum = 0;
        int leftSum = 0;

        for( int i : nums){
            totalSum += i;
        }

        for(int i =0 ; i<nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];

            answer[i] = Math.abs(rightSum-leftSum);

            leftSum +=nums[i];
        }

        // for( int i =0; i< nums.length; i++){
        //     if(i<=0){
        //         leftSum[i]=0;
        //     }
        //     for(int j=i-1; j>=0;j--){
        //         leftSum[i] += nums[j];
        //     }
        //     for(int k =i+1; k<nums.length; k++){
        //         rightSum[i]+=nums[k];
        //     }
        //     answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        // }
        return answer;
    }
}