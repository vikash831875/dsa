class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int longestchar = 0;
        int maxfreq = 0;

        for (int right = 0; right < s.length(); right++) {

            char rch = s.charAt(right);

            if (map.containsKey(rch)) {
                map.put(rch, map.get(rch) + 1);
            } else {
                map.put(rch, 1);
            }

            if (map.get(rch) > maxfreq) {
                maxfreq = map.get(rch);
            }

            while ((right - left + 1) - maxfreq > k) {
                char lch = s.charAt(left);
                map.put(lch, map.get(lch) - 1);
                left++;
            }

            int len = right - left + 1;

            if (len > longestchar) {
                longestchar = len;
            }
        }

        return longestchar;
    }
}