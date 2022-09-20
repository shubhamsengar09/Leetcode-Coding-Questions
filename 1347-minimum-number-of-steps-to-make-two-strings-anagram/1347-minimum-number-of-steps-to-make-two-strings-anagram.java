class Solution {
    public int minSteps(String s, String t) {
         int[] num = new int[26];
        for (int i=0; i<s.length(); i++) {
            num[s.charAt(i) - 'a']++;
            num[t.charAt(i) - 'a']--;
        }
        int res = 0;
        for (int i : num) {
            if (i > 0) res += i;
        }
        return res;
    }
}