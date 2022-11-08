class Solution {
    public String makeGood(String s) {
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) - 'a' == s.charAt(i+1) - 'A' || s.charAt(i+1) - 'a' == s.charAt(i) - 'A') {
                return makeGood(s.substring(0,i) + s.substring(i+2, s.length()));
            }
        }
        
        return s;
    }
}