class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> set = new HashSet<>();
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
                result[index++] = n;
                set.remove(n);
            }
        }
        return Arrays.copyOf(result, index);
    }
}