class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] s = new int[26];
        for(char c : magazine.toCharArray()) ++s[c-'a'];
        for(char c : ransomNote.toCharArray()){
            if(--s[c-'a']<0) return false;
        }
        return true;
    }
}