/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start

/*
 * 1. 位数不变，不进位，81 + 1 = 82，只改变个位 
 * 2. 位数不变，有进位，89 + 1 = 90，每个位都改变 3. 位数加1，有进位，99 + 1 = 100，增加1位，最高位为1，其余为0
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        // 情况1，2 ：位数不变，例如 79 + 1 = 80， 77 + 1 =78
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) { // 情况1: 加1后，不为0，就可以返回了； 情况2：为0不返回，则有进位需要继续循环判断前一位
                return digits;
            }
        }
        // 情况3：位数增加，例如 99 + 1 = 100, 第一位是1，后面都是0，新建一个长度增1的数组，首位为1即可
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
        
    }
}
// @lc code=end
