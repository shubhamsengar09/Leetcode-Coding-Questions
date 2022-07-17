class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        int a = 0;
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            sum = digits[i] + carry;
            a = sum % 10;
            carry = sum / 10;
            digits[i] = a;
        }

        if (carry != 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
        
    }
}