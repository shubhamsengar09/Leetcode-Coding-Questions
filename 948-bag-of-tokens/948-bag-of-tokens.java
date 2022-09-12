class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        if(tokens.length == 0 || power < tokens[0]) {
            return 0;
        }
        int score = 0;
        int i = 0;
        int j = tokens.length - 1;
        while(i <= j && power >= tokens[i]) {
            power -= tokens[i++];
            score += 1;
            if(score >= 1 && i < j && power < tokens[i]) {
                power += tokens[j--];
                score -= 1;
            }
        }
        return score;
    }
}