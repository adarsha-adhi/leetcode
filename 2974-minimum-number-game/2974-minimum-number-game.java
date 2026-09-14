class Solution {
    public int[] numberGame(int[] nums) {
        int [] arr = new int [nums.length];
        int min =0;
        Arrays.sort(nums);
        for(int i = 0; i<arr.length;i++){
            if(i%2==0){
                arr[i] = nums[i+1];
            }else{
                arr[i]= nums[i-1];
            }
        }
        return arr;
    }
}