package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
        Example 1:
        Input: s = "III"
        Output: 3
        Explanation: III = 3.

        Example 2:
        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.

        Example 3:
        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

public class RomanToNumber {

    private static Map<Character, Integer> getMap() {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        return mp;
    }

    public static int romanToNumber(String s) {
        int total = 0;
        int prevValue = 0;
        Map<Character , Integer> mp = getMap();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = mp.get(c);
            total = value < prevValue ? total -value : total + value;
            prevValue = value;
        }
        return total;
    }
}