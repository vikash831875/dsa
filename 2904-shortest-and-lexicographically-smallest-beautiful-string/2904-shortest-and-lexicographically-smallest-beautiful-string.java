class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        int minLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char rch = s.charAt(right);

            if (map.containsKey(rch)) {
                map.put(rch, map.get(rch) + 1);
            } else {
                map.put(rch, 1);
            }

            
            while (map.containsKey('1') && map.get('1') > k) {
                char lch = s.charAt(left);

                map.put(lch, map.get(lch) - 1);

                if (map.get(lch) == 0) {
                    map.remove(lch);
                }

                left++;
            }

            if (map.containsKey('1') && map.get('1') == k) {

                while (s.charAt(left) == '0') {
                    char lch = s.charAt(left);

                    map.put(lch, map.get(lch) - 1);

                    if (map.get(lch) == 0) {
                        map.remove(lch);
                    }

                    left++;
                }

                int len = right - left + 1;
                String current = s.substring(left, right + 1);

                if (len < minLength) {
                    minLength = len;
                    ans = current;
                }

                if (len == minLength && current.compareTo(ans) < 0) {
                    ans = current;
                }
            }
        }

        return ans;
    }
}