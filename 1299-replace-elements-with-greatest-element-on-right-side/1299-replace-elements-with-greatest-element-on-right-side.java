class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i =0; i<arr.length-1;i++){
            int max = i+1;
            for(int j =i+1; j<arr.length;j++){
                
                if(arr[j]>arr[max]){
                    max = j;
                }
                

            }
            arr[i]=arr[max];
            

        }
        arr[arr.length-1]=-1;
        return arr;
    }
}