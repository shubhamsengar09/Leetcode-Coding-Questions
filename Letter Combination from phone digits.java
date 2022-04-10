

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0)
            return res;
        Map<Character, String>m = new HashMap<>();
        
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7',"pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");
        
        backtrack(digits, m, 0, new StringBuilder (), res);
        return res;
    }
    
    void backtrack(String digits, Map<Character, String>m , int i ,StringBuilder ans, List<String>res){
        if(i==digits.length()){
            res.add(ans.toString());
            return;
        }
        
        String s = m.get(digits.charAt(i));
        for(int j =0; j<s.length();j++){
            ans.append(s.charAt(j));
            backtrack(digits, m , i+1, ans, res);
            ans.deleteCharAt(ans.length() -1);
        }
        
    }
}
