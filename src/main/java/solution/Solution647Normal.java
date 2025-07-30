package solution;

/**
 * 暴力搜索，先找出所有的字串，然后判断字串是不是回文字符串
 */
public class Solution647Normal {
    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                boolean manacher = isManacher(s.substring(j, j + i));
                result = manacher ? result + 1 : result;
            }
        }
        return result;
    }

    private boolean isManacher(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg";
        Solution647Normal solution647Normal = new Solution647Normal();
        int result = solution647Normal.countSubstrings(s);
        System.out.printf(String.valueOf(result));

    }
}
