public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] ap = new boolean[s.length()+1][s.length()+1];
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || ap[j+1][i-1])) ap[j][i] = true;
            }
        }
        backtrack(ans, new ArrayList<>(), ap, s, 0);
        return ans;
    }
    
    void backtrack(List<List<String>> ans, List<String> p, boolean[][] ap, String s, int pos) {
        if(pos == s.length()) {
            ans.add(new ArrayList<>(p));
            return;
        }
        
        for(int i = pos; i < s.length(); i++) {
            if(ap[pos][i]) {
                p.add(s.substring(pos,i+1));
                backtrack(ans, p, ap, s, i+1);
                p.remove(p.size()-1);
            }
        }
    }
}