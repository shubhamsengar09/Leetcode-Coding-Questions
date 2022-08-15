class Solution {
    static HashMap<Character , Integer> hm = new HashMap<>();
    static{
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
            
    }
    public int romanToInt(String s) {
       int res = 0;
       int A= 0;
        for(int i =0;i<s.length();i++){
            int B = hm.get(s.charAt(i));
            if(A<B)
                res -= A*2;
            A=B;
            res += B;
            
        }
        return res;
    }
}