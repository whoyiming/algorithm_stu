package com.hym.leetcode;

public class FindTheIndex28 {

    public int strStr(String haystack, String needle) {
        int index = -1;
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) ) {
                if ((i + needle.length() - 1) < haystack.length()) {
                    index = i;
                    for (int j = 1; j < needle.length(); j++) {
                        if (haystack.charAt(++i) != needle.charAt(j)) {
                            index = -1;
                            break;
                        }
                        return index;
                    }
                }
            } else {
                continue;
            }
        }
        return index;
    }

}
