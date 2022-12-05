package day1;

/**
 * @author zhaolin
 * @className searchInsert
 * @description 35. 搜索插入位置 https://leetcode.cn/problems/search-insert-position/
 * @date 2022/12/3
 **/
public class searchInsert {
    public static void main(String[] args)
    {
        int[] nums = {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }
}
