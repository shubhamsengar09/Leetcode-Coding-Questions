class Solution {
    public int repeatedStringMatch(String a, String b) {
        String str = a;
        int noc = b.length()/a.length() +2;
        int count =1;
        for(int i =1;i<=noc;i++){
            if(a.contains(b)) return count;
            else{
                a = a +str;
                count++;
            }
        }
        return -1;
    }
}