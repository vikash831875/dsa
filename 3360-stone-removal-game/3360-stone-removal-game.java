class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;

        while (n >= remove) {
            n = n  - remove; 
            remove = remove-1;
        }

        return remove % 2 == 1;
    }
}