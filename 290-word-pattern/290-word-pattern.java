class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mp = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i = 0; i < words.length; i++){
            char ch = pattern.charAt(i);
            if(!mp.containsKey(ch)){
                if(mp.containsValue(words[i])) return false;
                mp.put(ch, words[i]);
            }else{
                if(!mp.get(ch).equals(words[i])) return false;
            }
        }
        return true;
    }
}