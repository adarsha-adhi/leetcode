//import java.math.BigInteger;
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd =0;
        int sumEven =0;

        for(int i =0; i<n;i++){
            sumOdd+=1;
            sumEven+=2;
        }
        int ans =0;
        while(sumEven!=0){
            int temp = sumEven;
            sumEven=sumOdd%sumEven;
            ans = temp;
        }
        return ans;
    }
}