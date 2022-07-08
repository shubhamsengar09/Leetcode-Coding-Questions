class Solution {
    public int minPartitions(String n) {
        char a = '0';
        for(char c : n.toCharArray()){
            if(c>a)
                a=c;
            
        }
        return a - '0';
    }
}