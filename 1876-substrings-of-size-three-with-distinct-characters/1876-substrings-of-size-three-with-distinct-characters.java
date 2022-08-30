class Solution {
    public int countGoodSubstrings(String s) {
        int l =0;
        int r = 0;
        int ct =0;
        for(r=0;r<s.length();r++){
            while(r - l + 1 == 3){
                char c1 = s.charAt(l);
                char c2 = s.charAt(l+1);
                char c3 = s.charAt(l+2);
                
                if(c1!= c2 && c2 != c3 && c1!= c3) ct++;
                l++;
            }
        }
        return ct;
    }
}