/*
 * Problem: Running Sum of 1d Array (LeetCode Easy)
 * Approach: Prefix Sum
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class RunningSum {

    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] sums = new int[nums.length];
        sums[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }

        return sums;
    }
}
}
