class Solution {
    public boolean validPalindrome(String s) {
        return ispal(s, 0 , s.length()-1, false);
    }
    public boolean ispal(String s, int left, int right, boolean deleted){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                if(deleted)
                    return false;
                return ispal(s, left+1, right, true) || ispal(s, left, right-1, true);
            }
            left++;
            right--;
            
        }
        return true;
    }
}