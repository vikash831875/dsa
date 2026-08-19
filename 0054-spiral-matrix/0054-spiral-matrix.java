class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        int fr = 0;
        int lr = arr.length - 1;
        int fc = 0;
        int lc = arr[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        while (fr <= lr && fc <= lc) {

            for (int j = fc; j <= lc; j++) {
                ans.add(arr[fr][j]);
            }
            fr++;

            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--;

            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    ans.add(arr[lr][j]);
                }
                lr--;
            }

            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(arr[i][fc]);
                }
                fc++;
            }
        }

        return ans;
    }
}