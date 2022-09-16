class RandomizedSet {
    HashMap<Integer,Integer> set;
    ArrayList<Integer> nums;
    Random rand = new Random();
    public RandomizedSet() {
        set = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(set.containsKey(val))
            return false;
        set.put(val, nums.size());
        nums.add(nums.size(), val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!set.containsKey(val))
            return false;
        else{
            int lastElement = nums.get(nums.size() - 1);
            int idx = set.get(val);
            nums.set(idx, lastElement);
            set.put(lastElement, idx);
            nums.remove(nums.size()-1);
            set.remove(val);
        }
        return true;
    }    
    public int getRandom() {
         return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */