class Solution {

    public static void ans(int n, int open, int close,
                           String current, List<String> list) {

        // Complete valid string
        if (current.length() == 2 * n) {
            list.add(current);
            return;
        }

        // Add '('
        if (open < n) {
            ans(n, open + 1, close, current + "(", list);
        }

        // Add ')'
        if (close < open) {
            ans(n, open, close + 1, current + ")", list);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        ans(n, 0, 0, "", list);

        return list;
    }
}