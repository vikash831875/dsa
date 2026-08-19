class Solution {
    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int fr = 0;
        int lr = n - 1;
        int fc = 0;
        int lc = n - 1;

        int num = 1;

        while (fr <= lr && fc <= lc) {

            for (int j = fc; j <= lc; j++) {
                arr[fr][j] = num++;
            }
            fr++;

            for (int i = fr; i <= lr; i++) {
                arr[i][lc] = num++;
            }
            lc--;

            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    arr[lr][j] = num++;
                }
                lr--;
            }

            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    arr[i][fc] = num++;
                }
                fc++;
            }
        }

        return arr;
    }
}