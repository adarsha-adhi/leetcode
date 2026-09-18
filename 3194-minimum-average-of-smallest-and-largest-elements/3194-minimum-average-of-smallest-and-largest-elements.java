class Solution {
    public double minimumAverage(int[] nums) {
        
        Arrays.sort(nums);
        int l =0;
        int r =nums.length-1;
        
        double mavg = Double.MAX_VALUE;

        while(l<r){
            double avg = (nums[l]+nums[r])/2.0;

            if(avg<mavg){
                mavg=avg;
            }
            l++;
            r--;
        }
        return mavg;
    }
}