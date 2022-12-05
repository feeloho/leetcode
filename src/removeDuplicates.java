import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaolin
 * @className removeDuplicates
 * @description
 * @date 2022/11/5
 **/
public class removeDuplicates {
    /**
     * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
     26. 删除有序数组中的重复项
     给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
     由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么nums的前 k 个元素应该保存最终结果。
     将最终结果插入nums 的前 k 个位置后返回 k 。
     不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    public static void main(String[] args)
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        List<Integer> expectedNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] == nums[j]) {
                    if (expectedNums.contains(nums[i])) continue;
                    expectedNums.add(nums[i]);
                }
            }
        }

        System.out.println("length: " + expectedNums.size() + " nums: " + expectedNums);
    }


}
