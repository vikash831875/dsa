class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        int left = 0;
        int ones = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            // If we have more than k ones, move left
            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            // Now window has exactly k ones
            if (ones == k) {

                // Remove leading zeroes as much as possible
                while (s.charAt(left) == '0') {
                    left++;
                }

                int len = right - left + 1;

                if (len < minLen) {
                    minLen = len;
                    ans = s.substring(left, right + 1);
                } 
                else if (len == minLen) {
                    String current = s.substring(left, right + 1);

                    if (current.compareTo(ans) < 0) {
                        ans = current;
                    }
                }
            }
        }

        return ans;
    }
}