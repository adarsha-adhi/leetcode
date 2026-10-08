class Solution {
    public int largestAltitude(int[] gain) {
        int sum =0;
        int [] arr = new int[gain.length+1];
        int i =0;
        for(int num : gain){
            
            arr[i]=sum;
            i++;
            sum+=num;
        }
        arr[i] = sum;
        int max=0;
        for(int n : arr){
            if(n>max)
            max=n;
        }
        return max;
    }
}