package com.eric.leetcode;

import java.util.Arrays;

/**
 * @DESCIRPTION 有效的字母异位词
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/8/3 下午9:22
 */
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
        Arrays.sort(strS);
        Arrays.sort(strT);

        return Arrays.equals(strS, strT);
    }

    public static boolean isAnagramHash(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramHash(s, t));
    }
}
