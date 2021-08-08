/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1, len2 = n - 1, mergeLen = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            nums1[mergeLen--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        while (len2 >= 0) { // only combine with remaining nums2, len2 = 0 is only one element in nums2
            nums1[mergeLen--] = nums2[len2--];
        }
    }
}