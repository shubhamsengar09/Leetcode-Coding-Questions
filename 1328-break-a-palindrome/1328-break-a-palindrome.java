class Solution {
    public String breakPalindrome(String palindrome) {
         if (palindrome.length() == 0 || palindrome.length() == 1)
            return "";
        char [] ch = palindrome.toCharArray();
        int len = palindrome.length();
        for (int i=0; i<len/2; i++) {
            if (ch[i] != 'a') {
                ch[i] = 'a';
                return String.valueOf(ch);
            }
        }
        ch[len - 1] = 'b';
        return String.valueOf(ch);
    }
}