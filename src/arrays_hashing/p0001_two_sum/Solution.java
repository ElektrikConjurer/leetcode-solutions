package arrays_hashing.p0001_two_sum;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] retValue = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int sum = target - nums[j];

            if (map.containsKey(sum)) {
                if (map.get(sum) != j) {
                    retValue[0] = j;
                    retValue[1] = map.get(sum);
                }
            }
        }

        return retValue;
    }
}
