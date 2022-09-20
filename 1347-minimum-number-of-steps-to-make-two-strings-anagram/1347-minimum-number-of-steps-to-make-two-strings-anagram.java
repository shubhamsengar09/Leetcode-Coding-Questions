class Solution {
    public int minSteps(String s, String t) {
        int n =0;
        Map<Character,Integer>mp = new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            if(mp.containsKey(c) && mp.get(c)>0) mp.put(c,mp.get(c)-1);
            else n++;
        }
        return n;
    }
}