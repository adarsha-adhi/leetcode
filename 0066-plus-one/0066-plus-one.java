class Solution {
    public int[] plusOne(int[] digits) {
        int s = digits.length-1;
        while(s>=0){
            if(digits[s]<9){
            digits[s] +=1;
            return digits;
        }
           
        digits[s] = 0;
            s -=1;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }

}