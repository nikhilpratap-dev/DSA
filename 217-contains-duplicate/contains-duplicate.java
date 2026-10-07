class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int a : nums){
            if(hash.contains(a)) return true;
            hash.add(a);
        }
        return false;
        
    }
}