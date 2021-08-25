/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
/**
 * 有 k mod n 个数移动到数组前面，前面的数移动 k mod n 步，例如，如果n = 7, k = 14,则原地不动，k mod n = 0，k =
 * 15,则只移动1步
 */
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return;
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}