// Last updated: 8/11/2026, 11:31:33 AM
class Solution {
    public int[] sortArray(int[] nums) {
        split(nums);
        return nums;
    }
    public void split(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        int mid = n / 2;
        int[] leftarray = new int[mid];
        int[] rightarray = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            leftarray[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            rightarray[i - mid] = a[i];
        }
        split(leftarray);
        split(rightarray);
        merge(leftarray, rightarray, a);
    }
    public void merge(int[] leftarray, int[] rightarray, int[] a) {
        int lesize = leftarray.length;
        int risize = rightarray.length;
        int i = 0, le = 0, ri = 0;
        while (le < lesize && ri < risize) {
            if (leftarray[le] < rightarray[ri]) {
                a[i] = leftarray[le];
                i++;
                le++;
            } else {
                a[i] = rightarray[ri];
                i++;
                ri++;
            }
        }
        while (le < lesize) {
            a[i] = leftarray[le];
            i++;
            le++;
        }
        while (ri < risize) {
            a[i] = rightarray[ri];
            i++;
            ri++;
        }
    }
}
