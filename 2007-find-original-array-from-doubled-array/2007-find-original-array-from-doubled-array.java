class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n % 2 != 0)return new int[0];
        int[] res = new int[n/2];
        int i = 0;
        Arrays.sort(changed);
        int j = n-1;
        Map<Integer,Integer> map = new HashMap<>();
        while(j >= 0){
            int a = changed[j];
            int d = a * 2;
            if(map.containsKey(d)){
                if(map.get(d) == 1)map.remove(d);
                else map.put(d,map.get(d) - 1);
                res[i++] = a;
            }else map.put(a,map.getOrDefault(a,0) + 1);
            j--;
        }
        return i == n/2 ? res : new int[0];
    }
}