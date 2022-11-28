package org.example.leetcode;

import java.util.HashMap;

//https://labuladong.github.io/algo/2/20/27/
public class HuiDongWindow {
    String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        //need 是需要覆盖的，包括的字符串，先初始化
        for (int i = 0; i < t.length(); i++) {
            need.put(s.charAt(i), need.getOrDefault(s.charAt(i), 0) + 1);
        }
        int left = 0, right = 0;
        int count = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    count++;

                }
            }

            while (count == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        count--;
                        window.put(d, window.getOrDefault(d, 1) - 1);

                    }
                }

            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, len);

    }
}
