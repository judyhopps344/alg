class RemoveDuplicates {
    /*
    * @lc app=leetcode.cn id=26 lang=java
    *
    * [26] 删除有序数组中的重复项
    */
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        int len = nums.length;
        if (len < 2)
            return len;
        int i = 1, j = 1;
        while (i < len) {
            //从1开始，和前面一个不重复，不重复的保存到j
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3,3,4};
        int count = new RemoveDuplicates().removeDuplicates(nums);
        System.out.println("the count of remove duplicates: " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i]);
        }
    }
}
