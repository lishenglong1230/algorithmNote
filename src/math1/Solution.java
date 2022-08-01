package math1;

import java.util.Arrays;

/**
 * @Author: Lishenglong
 * @Date: 2022/7/29 16:34
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = nums[i];
            }else {
                res[i]= res[i-1] +nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        int[] ints = solution.runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }
}