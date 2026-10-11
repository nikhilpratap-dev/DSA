class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> newSet = new HashSet<>();
        for(int n : nums1){
            set.add(n);
        }
        for(int check : nums2){
            if(set.contains(check)){
                newSet.add(check);
            }
        }
        int pointer = 0;
        int[] newArray = new int[newSet.size()];
        for(int unique : newSet){
            newArray[pointer] = unique;
            pointer++;
        }
        return newArray;

    }
}