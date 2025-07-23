package solution;

public class Solution647 {
    public int countSubstrings(String s) {
        /**
         * 暴力解法，两个步骤
         * 1. 找出所有的子串
         * 1.1 i为选择的长度，1,2,3
         * 1.2 第二个循环j = 0; j + i < s.length, 截取 [j,j+i]的字符串，执行第二步判断
         * 2. 对所有的字串判断是否是回文字符串
         *
         */
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

        }
    }
}
