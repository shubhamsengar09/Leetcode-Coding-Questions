class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> allValues;
    public RandomizedSet() {
       map = new HashMap<>();
	   allValues = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        allValues.add(val);
		map.put(val, allValues.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
		allValues.set(map.get(val), allValues.get(allValues.size() - 1));
		map.put(allValues.get(allValues.size() - 1), map.get(val));
        map.remove(val);
		allValues.remove(allValues.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return allValues.get((int)(Math.random() * allValues.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */