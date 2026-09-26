package arrays_hashing.p1929_concatenation_of_array;

class Solution {
    // runtime: O(n), memory: O(n)
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}