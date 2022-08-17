package math3;

import javax.swing.*;

/**
 * @Author: Lishenglong
 * @Date: 2022/8/17 15:09
 *
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 */
public class Solution {
    //只要是相同的肯定是挨着的
    //双指针解决
    //使用两个指针，右指针始终往右移动，
    //
    //如果右指针指向的值等于左指针指向的值，左指针不动。
    //如果右指针指向的值不等于左指针指向的值，那么左指针往右移一步，然后再把右指针指向的值赋给左指针。
    //
    //作者：数据结构和算法
    //链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2gy9m/?discussion=4Zkrel
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public int removeDuplicate(int[] A){
        if (A==null || A.length==0){
            return 0;
        }
        int left = 0;
        for (int right = 1;right<A.length;right++){
            if (A[left]!=A[right]){
                A[++left] = A[right];
            }
        }
        return left+1;
    }

    public int removeDuplicate2(int[] A){
        int count = 0; //重复数字个数
        for (int i = 0; i < A.length; i++) {
            if (A[i] == A[i-1]){
                count++;
            }else {
                A[i-count] = A[i];
            }

        }
        return A.length-count;
    }

    public static void main(String[] args) {
        int[] nums ={1,1,2};
        int i = new Solution().removeDuplicate(nums);
        System.out.println(i);
    }
}
