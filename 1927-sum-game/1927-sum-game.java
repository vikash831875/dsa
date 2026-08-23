class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int mid = n / 2;

        int diff = 0;
        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < mid; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                leftQ++;
            } else {
                diff += ch - '0';
            }
        }

        for (int i = mid; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                rightQ++;
            } else {
                diff -= ch - '0';
            }
        }

        
        if (leftQ == rightQ) {
            return diff != 0;
        }

      
        if ((leftQ - rightQ) % 2 != 0) {
            return true;
        }

        int qDiff = leftQ - rightQ;

       
        if (qDiff > 0) {
            return diff + (qDiff / 2) * 9 != 0;
        }

        
        return diff + (qDiff / 2) * 9 != 0;
    }
}