class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            int c = index[i];
            for (int j = i; j > c; j--) {
                target[j] = target[j - 1];
            }
            target[c]= nums[i];
        }
        return target;
    }
}