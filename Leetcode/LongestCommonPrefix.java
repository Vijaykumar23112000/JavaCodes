package Leetcode;

import java.util.Arrays;

/*
        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String str []){
        StringBuilder res = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for(int i = 0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)) return res.toString();
            res.append(first.charAt(i));
        }
        return res.toString();
    }       
    
}