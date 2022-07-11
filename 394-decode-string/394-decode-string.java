class Solution {
    int i ;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(i<s.length()){
            char c = s.charAt(i);
            i++;
            if(c == ']') break;
            if(Character.isLetter(c)){
                sb.append(c);
                continue;
            }
            if(c == '['){
                String res = decodeString(s);
                for(int j =0;j<count;j++){
                    sb.append(res);
                }
                count = 0;
            }else{
                count = count*10 + c-'0';
            }
        }
        return sb.toString();
    }
}