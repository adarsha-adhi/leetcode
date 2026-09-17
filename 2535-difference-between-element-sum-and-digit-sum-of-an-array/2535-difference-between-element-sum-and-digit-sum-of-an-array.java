class Solution {
    public int differenceOfSum(int[] nums) {
        int esum =0;
        int dsum =0;
        for(int num : nums){
            esum+=num;
            while(num!=0){
                int d = num%10;
                dsum+=d;
                num = num/10;
            }
        }
        int ans = Math.abs(esum-dsum);
        return ans;
        
    }
}