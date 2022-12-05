package day1;

/**
 * @author zhaolin
 * @className secondHighest
 * @description 字符串中第二大的数字
 * @date 2022/12/3
 **/
public class secondHighest {
    public static void main(String[] args)
    {
        String s = "sjhtz8344";
        System.out.println(secondHighest(s));
    }


    public static int secondHighest(String s) {
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num < first && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }
}
