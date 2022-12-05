import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaolin
 * @className brix01
 * @description TODO 类描述
 * @date 2022/11/28
 **/
public class brix01 {
    public static void main(String[] args)
    {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middel = (left + right) / 2;
            if (nums[middel] > target) {
                right = middel - 1;
            } else if (nums[middel] < target) {
                left = middel + 1;
            } else {
                return middel;
            }
        }

        return -1;
    }
}
