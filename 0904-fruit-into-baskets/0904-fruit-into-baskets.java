class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        int prev = -1;
        int last = -1;
        int lastCount = 0;
        for (int right = 0; right < fruits.length; right++) {

            if (fruits[right] == last) {
                lastCount++;
            }
            else if (fruits[right] == prev) {
                lastCount = 1;
                prev = last;
                last = fruits[right];
            }
            else {
                left = right - lastCount;
                prev = last;
                last = fruits[right];
                lastCount = 1;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}