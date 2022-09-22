class Solution {
    public boolean divisorGame(int n) {
        boolean res [] = new boolean[n+1];
        if(n==1) return false;
        res [1] = false;
        res [2] = true;
        for(int i =3;i<=n;i++){
            res[i] = false;
            for(int j = 1; j < i; j++){
                if(i % j == 0 && !res[i - j]){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[n];
    }
}