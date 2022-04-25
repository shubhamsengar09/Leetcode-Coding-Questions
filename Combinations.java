

class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, new ArrayList(), 1, k);
        return res;
    }
    public void backtrack(int n, List<Integer> list, int index, int k) {
        if (list.size() == k) {
            res.add(new ArrayList(list));      
            return;
        }
        for (int i = index; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);
            backtrack(n, list, i + 1, k);
            list.remove(list.size() - 1);
        }        
    }
}
