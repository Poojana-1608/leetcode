// Last updated: 8/11/2026, 11:30:39 AM
class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            int s = salary[i];
            sum += s;
            if (s < min) min = s;
            if (s > max) max = s;
        }

        sum -= min;
        sum -= max;

        return sum / (salary.length - 2);
    }
}
