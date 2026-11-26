class Solution {
    public boolean canAliceWin(int n) {

        int remove = 10;

        while(n >= remove) {
            n = n - remove;
            remove--;

            if(n < remove) {
                return true;
            }

            n = n - remove;
            remove--;
        }

        return false;
    }
}