class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String p : paths){
            String [] res = p.split(" ");
            for(int i =1;i<res.length;i++){
                String av = res[i].substring(res[i].indexOf("(")+1,res[i].indexOf(")"));
                if(!mp.containsKey(av))  mp.put(av,new ArrayList<>());
                List<String> copy = mp.get(av);
                copy.add(res[0] + "/" + res[i].substring(0,res[i].indexOf("(")));
                mp.put(av,copy);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : mp.keySet()){
            if(mp.get(s).size()>1){
                List<String> dup = new ArrayList<>();
                for(String d : mp.get(s)){
                    dup.add(d);
                }
                ans.add(dup);
            }
            
        }
        return ans;
    }
}