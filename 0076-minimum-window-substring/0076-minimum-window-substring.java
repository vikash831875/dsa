import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> tm = new HashMap<>();
        HashMap<Character, Integer> sm = new HashMap<>();

        // Store frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int have = 0;
        int need = tm.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            sm.put(ch, sm.getOrDefault(ch, 0) + 1);

            // Check if current character frequency matches required frequency
            if (tm.containsKey(ch) &&
                sm.get(ch).intValue() == tm.get(ch).intValue()) {
                have++;
            }

            // Try to shrink the window
            while (have == need) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                sm.put(leftChar, sm.get(leftChar) - 1);

                if (tm.containsKey(leftChar) &&
                    sm.get(leftChar) < tm.get(leftChar)) {
                    have--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}