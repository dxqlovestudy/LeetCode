package solution;

/**
 * 以一个节点为中心，向两边扩散去找回文子串
 */
public class Solution647Plus {
    public int countSubstrings(String s) {
        int length = s.length();
        int result = length;
        for (int i = 0; i < length; i++) {
            int left = i - 1;
            int rigth = i + 1;
            while (left >= 0 && rigth < length && s.charAt(left) == s.charAt(rigth)) {
                left--;
                rigth++;
                result++;
            }
        }
        for (int i = 0; i < length; i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg";
        Solution647Plus solution647Normal = new Solution647Plus();
        int result = solution647Normal.countSubstrings(s);
        System.out.printf(String.valueOf(result));

    }
}
