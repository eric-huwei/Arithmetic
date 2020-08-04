package com.eric.leetcode;

import java.util.*;

/**
 * @DESCIRPTION 字母异位词分组
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/8/3 下午11:40
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for (String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(str);
        }

        return new ArrayList(ans.values());
    }


}
