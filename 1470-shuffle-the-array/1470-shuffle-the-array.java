class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int first = 0; 
        int mid = n;
        int count =0;
        for(int i =0; i<n; i++){
            ans[count]=nums[first];
            first++;
            count++;
            ans[count]= nums[mid];
            mid++;
            count++;
        }
        return ans;
}
}