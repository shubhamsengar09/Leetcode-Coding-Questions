class Solution {
    public String orderlyQueue(String s, int k) {
        String ans = s;
        if(k==1){
            for(int i =0;i<s.length();i++){
                String temp= s.substring(i)+ s.substring(0,i);
                if(ans.compareTo(temp)>0) ans = temp;
            }
        }else{
            char [] sol = ans.toCharArray();
            Arrays.sort(sol);
            ans = new String(sol);
        }
        return ans;
    }
}