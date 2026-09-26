package arrays_hashing.p0217_contains_dublicate;

import java.util.HashSet;

class Solution {
    //  runtime: O(n), memory: O(n)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }

        return false;
    }
}
