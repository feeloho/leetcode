package day1;



/**
 * @author zhaolin
 * @className mySqrt
 * @description 69. x 的平方根  https://leetcode.cn/problems/sqrtx/
 * @date 2022/12/3
 **/
public class mySqrt {
    public static void main(String[] args)
    {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        int left = 1;
        int right = x;
        while (left < right) {
            int middle = left + (right - left) / 2;
            long sqrtNumRes = (long) middle * (long)middle;
            if (sqrtNumRes < x) {
                left = middle + 1; // [middle + 1....right]
            } else if (sqrtNumRes > x) {
                right = middle;
            } else {
                return middle;
            }
        }

        return left - 1;
    }
}
